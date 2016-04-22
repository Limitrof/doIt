package com.limitrof.doit;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;//анимация "гамбургера"
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    //private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBar();
        setDrawerLayout();
    }
    private void setActionBar(){
        toolbar=(Toolbar)findViewById(R.id.toolbar);//переводим во вью приведенное к тулбару из саппорт-библиотеки
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    private void setDrawerLayout(){
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);//дожен быть имплементирован интерфейс
        setTitle(getString(R.string.app_name));
    }
//interface add after implementation NavigationView.OnNavigationItemSelectedListener
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }
}
