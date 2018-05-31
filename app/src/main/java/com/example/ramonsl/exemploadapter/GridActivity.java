package com.example.ramonsl.exemploadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        ArrayList<Carros> myCars= new ArrayList<Carros>();
        Carros a= new Carros("Celta",1.0,"GM");
        myCars.add(a);

        ///ou de forma hard

        myCars.add(new  Carros("Corsa",1.6,"GM"));
        myCars.add(new  Carros("Palio",1.6,"FIAT"));
        myCars.add(new  Carros("Astra",2.0,"GM"));
        myCars.add(new  Carros("2008",1.4,"PEUGEOT"));
        myCars.add(new  Carros("308",2.0,"PEUGEOT"));

        CarrosAdapter adapter = new CarrosAdapter(this,myCars);
        GridView grid= (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);


    }
}
