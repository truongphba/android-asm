package com.example.asm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;


public class List extends Fragment {
    private java.util.List<Spend> listSpend = new ArrayList<>();
    private DBHelper dbHelper;
    private Cursor c;
    private SimpleCursorAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initData();
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        SpendAdapter adapter = new SpendAdapter(this.getActivity(), listSpend);
        RecyclerView.LayoutManager layoutManager =  new GridLayoutManager(this.getContext(), 2);
        RecyclerView rvProduct = (RecyclerView) rootView.findViewById(R.id.rvSpend);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    private void initData(){
        dbHelper = new DBHelper(this.getContext());
        c = dbHelper.getAllPayments();
        adapter = new SimpleCursorAdapter(this, R.layout.fragment_list, c, new String[]{
                DBHelper.ID, DBHelper.NAME, DBHelper.DESCRIPTION, DBHelper.DETAIL, DBHelper.AMOUNT, DBHelper.TIME, DBHelper.CATEGORY_ID}, new int[]{R.id.tvName,
        })

    }

}