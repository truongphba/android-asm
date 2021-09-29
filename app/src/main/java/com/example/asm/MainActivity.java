package com.example.asm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, NavigationBarView.OnItemSelectedListener{

    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;
    FrameLayout mainContent;
    Add add;
    List list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        drawerLayout = findViewById(R.id.drawer_layout);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnItemSelectedListener(this);

        mainContent = findViewById(R.id.main_content);
        list = new List();
        add = new Add();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content, list, List.class.getName())
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.list_button:
                Log.d(MainActivity.class.getName(), "List");
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_content, list, List.class.getName())
                        .commit();
                break;
            case R.id.add_button:
                Log.d(MainActivity.class.getName(), "Add");
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_content, add, Add.class.getName())
                        .commit();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        return false;
    }
}