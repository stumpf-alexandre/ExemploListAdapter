package com.example.ramonsl.exemploadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView simple= findViewById(R.id.txtList);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,SimpleListView.class);
                startActivity(it);
            }
        });

        TextView custom= findViewById(R.id.txtCuston);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,CustomActivity.class);
                startActivity(it);
            }
        });



        TextView gridV= findViewById(R.id.txtGrid);
        gridV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,GridActivity.class);
                startActivity(it);
            }
        });
    }
}
