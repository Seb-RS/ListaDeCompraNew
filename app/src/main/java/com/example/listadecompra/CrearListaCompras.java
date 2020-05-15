package com.example.listadecompra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CrearListaCompras extends Fragment {

    public CrearListaCompras() {
        // Required empty public constructor
    }

    String compra = "";
    Button btn;
    View vista;
    TextView texto;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    int Contador;
    int total = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_crear_lista_compras, container, false);
        btn = (Button) vista.findViewById(R.id.botonCrearLista);
        checkBox1 = (CheckBox) vista.findViewById(R.id.checkProducto1);
        checkBox2 = (CheckBox) vista.findViewById(R.id.checkProducto2);
        checkBox3 = (CheckBox) vista.findViewById(R.id.checkProducto3);
        checkBox4 = (CheckBox) vista.findViewById(R.id.checkProducto4);
        texto = (TextView) vista.findViewById(R.id.text_slideshow3);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"Lista de Compra creada",Toast.LENGTH_LONG ).show();
                /*if(getArguments() != null)
                {
                    Contador = getArguments().getInt("Contador", 0);
                }
                */

                if(Contador>2)
                {
                    Toast.makeText(getContext(),"Alcanzaste el máximo de listas creadas",Toast.LENGTH_LONG ).show();
                }
                else
                {
                    if(checkBox1.isChecked() || checkBox2.isChecked() || (checkBox3.isChecked()) || (checkBox4.isChecked()))
                    {
                        compra = "Nueva lista:";
                        if(checkBox1.isChecked())
                        {
                            compra = compra+" Aceite";
                            checkBox1.toggle();
                        }
                        if(checkBox2.isChecked())
                        {
                            compra = compra+" Fideos";
                            checkBox2.toggle();
                        }
                        if(checkBox3.isChecked())
                        {
                            compra = compra+" Atún";
                            checkBox3.toggle();
                        }
                        if(checkBox4.isChecked())
                        {
                            compra = compra+" Harina";
                            checkBox4.toggle();
                        }
                        Contador++;
                        total = 0;
                        texto.setText("Total: "+total);
                    }
                    else
                    {
                        compra = "Selecciona al menos un producto";
                    }
                    Toast.makeText(getContext(),compra,Toast.LENGTH_LONG ).show();
                }

            }

        });

        checkBox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked())
                {
                    total += 700;
                }
                else
                {
                    total -= 700;
                }
                texto.setText("Total: "+total);
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(checkBox2.isChecked())
                {
                    total += 600;
                }
                else
                {
                    total -= 600;
                }
                texto.setText("Total: "+total);
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(checkBox3.isChecked())
                {
                    total += 600;
                }
                else
                {
                    total -= 600;
                }
                texto.setText("Total: "+total);
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(checkBox4.isChecked())
                {
                    total += 800;
                }
                else
                {
                    total -= 800;
                }
                texto.setText("Total: "+total);
            }
        });


        return vista;
    }
}
