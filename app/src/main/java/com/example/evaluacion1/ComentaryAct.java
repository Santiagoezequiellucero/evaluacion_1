package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class ComentaryAct extends AppCompatActivity {

    private RatingBar rating;
    private ProgressBar progress;
    private int progreso;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentary);
        rating = (RatingBar) findViewById(R.id.rB);
        progress = (ProgressBar) findViewById(R.id.pb);
        spinner = (Spinner)findViewById(R.id.sP);

        String[]electrodomesticos = {"(Elija Producto)","Televisor","Refrigerador","Horno","Lavadora"};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, electrodomesticos);
        spinner.setAdapter(adapter);

    }

    public void Calificar(View v)
    {
       rating.setRating(3);
    }
    public void Rellenar( View v)
    {
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                progreso ++;
                progress.setProgress(progreso);
            }
        };
        long delay= 0;
        long period = 100;
        t.schedule(tt,delay ,period  );
    }


}