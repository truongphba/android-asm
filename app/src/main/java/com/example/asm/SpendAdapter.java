package com.example.asm;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SpendAdapter extends RecyclerView.Adapter {

    private Activity activity;
    private List<Spend> listSpend;

    public SpendAdapter(Activity activity, List<Spend> listSpend) {
        this.activity = activity;
        this.listSpend = listSpend;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item, parent, false);
        SpendHolder holder = new SpendHolder(itemView);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SpendHolder productHolder = (SpendHolder) holder;
        Spend model = listSpend.get(position);
        productHolder.tvName.setText(model.getName());
        productHolder.tvDescription.setText(model.getDescription());
        productHolder.tvDetail.setText(model.getDetail());
        productHolder.tvAmount.setText(model.getAmount().toString());
        productHolder.tvTime.setText(model.getTime());
        productHolder.tvCategory.setText(model.getCategory());
        productHolder.tvDetail.setText(model.getDetail());
    }

    @Override
    public int getItemCount() {
        return listSpend.size();
    }

    public class SpendHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvDescription;
        TextView tvDetail;
        TextView tvAmount;
        TextView tvTime;
        TextView tvCategory;

        public SpendHolder(@NonNull View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvDetail = itemView.findViewById(R.id.tvDetail);
            tvAmount = itemView.findViewById(R.id.tvAmount);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvCategory = itemView.findViewById(R.id.tvCategory);

        }
    }
}
