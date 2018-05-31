package com.example.ramonsl.exemploadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ramonsl on 04/04/2018.
 */

public class CarrosAdapter extends ArrayAdapter<Carros> {


    public CarrosAdapter(@NonNull Context context,  @NonNull List<Carros> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         View listItemView= convertView;

         if(listItemView==null){
             listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_carro,parent,false);
         }

        Carros current =getItem(position);

        TextView nome = (TextView) listItemView.findViewById(R.id.txtNome);
        TextView motor = (TextView) listItemView.findViewById(R.id.txtMotor);
        TextView marca = (TextView) listItemView.findViewById(R.id.txtMarca);

        nome.setText(current.getNome().toString());
        motor.setText(current.getMotor().toString());
        marca.setText(current.getMarca().toString());

            return  listItemView;
        //     return super.getView(position, convertView, parent);
    }
}
