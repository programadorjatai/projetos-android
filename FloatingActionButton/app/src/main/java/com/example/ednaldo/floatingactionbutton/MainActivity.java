package com.example.ednaldo.floatingactionbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    private FloatingActionMenu menu;

    private FloatingActionButton fab1;

    private FloatingActionButton fab2;

    private FloatingActionButton fab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.menu = (FloatingActionMenu) findViewById(R.id.mn_buttom);
        this.fab1 = (FloatingActionButton) findViewById(R.id.fab_1);
        this.fab2 = (FloatingActionButton) findViewById(R.id.fab_2);
        this.fab3 = (FloatingActionButton) findViewById(R.id.fab_3);

        this.fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_LONG).show();
            }
        });

        this.fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Item 2", Toast.LENGTH_LONG).show();
            }
        });

        this.fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Item 3", Toast.LENGTH_LONG).show();
            }
        });
    }
}
