package com.example.andriod.ptesjol.Activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.andriod.ptesjol.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tlbMain = findViewById(R.id.tlb_main);
        setSupportActionBar(tlbMain);
        getSupportActionBar().setTitle("Faculty of Engineering");

        // Create actionbar drawer toggle
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, tlbMain, R.string.drawer_open_desc, R.string.drawer_close_desc);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

    }
}
