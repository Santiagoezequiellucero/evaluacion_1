package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Producto(View v)
    {
        Intent i = new Intent (this, ProductoAct.class);
         startActivity(i);
    }

    public void Comentarios(View v)
    {
        Intent i = new Intent (this, ComentaryAct.class);
        startActivity(i);
    }

    public void Clientes(View v)
    {
        Intent i = new Intent (this, ClientesAct.class);
        startActivity(i);
    }
    public void Info(View v)
    {
        Intent i = new Intent (this, InfoAct.class);
        startActivity(i);
    }
}