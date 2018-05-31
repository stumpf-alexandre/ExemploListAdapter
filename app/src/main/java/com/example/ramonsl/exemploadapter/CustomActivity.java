package com.example.ramonsl.exemploadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);


        ArrayList<Carros> myCars= new ArrayList<Carros>();
        Carros a= new Carros("Celta",1.0,"GM");
        myCars.add(a);

        ///ou de forma hard

        myCars.add(new  Carros("Corsa",1.6,"GM"));
        myCars.add(new  Carros("Palio",1.6,"FIAT"));
        myCars.add(new  Carros("Astra",2.0,"GM"));
        myCars.add(new  Carros("2008",1.4,"PEUGEOT"));
        myCars.add(new  Carros("308",2.0,"PEUGEOT"));

        final CarrosAdapter adapter = new CarrosAdapter(this,myCars);
        ListView list= (ListView) findViewById(R.id.listaCarros);
        list.setAdapter(adapter);




     list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Carros c= (Carros) parent.getItemAtPosition(position);
             Toast.makeText(getApplicationContext(),c.toString(),Toast.LENGTH_LONG).show();
         }
     });
    }
}
