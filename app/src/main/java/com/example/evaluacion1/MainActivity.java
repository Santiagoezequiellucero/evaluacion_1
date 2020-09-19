package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, pass;
    private Button btnIniciar;
    private TextView tv;
    private boolean f = false;


   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.txtNombre);
        pass = (EditText)findViewById(R.id.txtPass);
        tv = (TextView)findViewById(R.id.txtAdvertencia);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);

}


    public void Menu(View v)
    {
        Intent i = new Intent (this, MenuAct.class);
        String a =nombre.getText().toString();
        String b =pass.getText().toString();
        String c = tv.getText().toString();


        if(a.equalsIgnoreCase("Android") && b.equals("123")){
                startActivity(i);
         }
         else {
            tv.setText("usuario o contraseña incorrecto\n" +
                    "Pulse iniciar");
         }

         if (!(c.isEmpty())){
             tv.setText("");
             nombre.setText("");
             pass.setText("");

         }
    }



}