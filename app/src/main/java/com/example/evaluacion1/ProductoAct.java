package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ProductoAct extends AppCompatActivity {

    private EditText producto;
    private EditText monto;
    private CheckBox domicilio, sucursal, gratis;
    private TextView resultado;
    private int valor;
    int envio;
    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        producto = (EditText)findViewById(R.id.txtProducto);
        monto = (EditText)findViewById(R.id.txtMonto);
        domicilio = (CheckBox)findViewById(R.id.chbDomicilio);
        sucursal = (CheckBox)findViewById(R.id.chbSucursal);
        gratis = (CheckBox)findViewById(R.id.chbGratis);
        resultado = (TextView)findViewById(R.id.txtResultadoProducto);


    }

    public void Calcular(View v) {
        String a = producto.getText().toString();
        int b = Integer.parseInt(monto.getText().toString());

        if (a.equalsIgnoreCase("televisor")) {
            valor = (domicilio.isChecked()) ? 129000 + 14500 : 129000;
            r = valor - b;
        } else if (a.equalsIgnoreCase("microondas")) {
            valor = (domicilio.isChecked()) ? 50000 + 5500 : 50000;
            r = valor - b;
        } else if (a.equalsIgnoreCase("lavadora")) {
            valor = (domicilio.isChecked()) ? 100000 + 25000 : 100000;
            r = valor - b;
        }
        resultado.setText("El saldo es: $" + r);
    }
}