package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class ClientesAct extends AppCompatActivity {
    private Spinner spinner;
    private EditText producto;
    private TextView saldo;
    private HashMap<String, Integer> prod = new HashMap<>();
    private int disponible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientesd);
        producto = (EditText)findViewById(R.id.txtProdClien);
        saldo = (TextView)findViewById(R.id.txtSaldo);
        spinner = (Spinner)findViewById(R.id.spinner);
        String [] clientes = {"(Elija el cliente)","Mario","Constanza","Fernanda"};
        prod.put("horno",45000);
        prod.put("espejo",100000);
        prod.put("sillas",80000);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, clientes);
        spinner.setAdapter(adapter);

    }
    public void Calcular(View v) {
        String p = producto.getText().toString().toLowerCase();
        if (prod.containsKey(p)) {
            switch (spinner.getSelectedItemPosition()) {
                case 0:
                    disponible = 500000 + prod.get(p);
                    break;
                case 1:
                    disponible = 320000 + prod.get(p);
                    break;
                case 2:
                    disponible = 120000 + prod.get(p);
                    break;

            }
            saldo.setText("Saldo final:" + String.valueOf(disponible));
        } 
    }

}