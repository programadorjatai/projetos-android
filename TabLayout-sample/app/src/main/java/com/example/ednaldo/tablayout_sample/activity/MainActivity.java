package com.example.ednaldo.tablayout_sample.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ednaldo.tablayout_sample.R;
import com.example.ednaldo.tablayout_sample.adapter.TabAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.tabLayout = (TabLayout) findViewById(R.id.tb_layout);
        tabLayout.addTab(this.tabLayout.newTab().setText("Pedido"));
        tabLayout.addTab(this.tabLayout.newTab().setText("Itens"));

        this.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        this.viewPager = (ViewPager) findViewById(R.id.pager);
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager(), this.tabLayout.getTabCount());
        this.viewPager.setAdapter(adapter);

        this.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        this.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
