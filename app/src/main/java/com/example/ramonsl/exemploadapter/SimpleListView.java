package com.example.ramonsl.exemploadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        /* Array de strings a serem listadas*/

        ArrayList<String> words = new ArrayList<String>();
        words.add("Mcqueen");
        words.add("King");
        words.add("Chick");
        words.add("Doc Hudson");
        words.add("Sargento");
        words.add("Filmore");

        //Criando o adapter , que precisa de 3 argumentos , o contexto, o layout que vai ser usado e , a lista
        ArrayAdapter<String> itensAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,words);

        //Link com a view que vai mostrar os resultados, no caso list
        ListView list= (ListView) findViewById(R.id.list);

        ///Setando o adapter na lista;
        list.setAdapter(itensAdapter);



    }
}
