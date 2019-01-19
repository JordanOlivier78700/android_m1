package com.example.jogral.m1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jogral on 18/01/2019.
 */

public class Ex1 extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1);
        tv = findViewById(R.id.textView);
    }

    public void click_quitter(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, MainActivity.class));
    }
    public void click_bonjour(View view)
    {
        //Retour a la page Home
        tv.setText("Bonjour");
    }
    public void click_enrevoir(View view)
    {
        //Retour a la page Home
        tv.setText("En revoir!");
    }
    public void click_rouge(View view)
    {
        //Retour a la page Home
       tv.setTextColor(Color.RED);
    }
    public void click_noir(View view)
    {
        //Retour a la page Home
        tv.setTextColor(Color.BLACK);
    }
    public void click_heure(View view)
    {
        //Retour a la page Home
        SimpleDateFormat spDate = new SimpleDateFormat("HH:mm:ss");

        tv.setText(spDate.format(new Date()).toString());
    }
}