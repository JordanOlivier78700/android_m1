package com.example.jogral.m1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jogral on 18/01/2019.
 */

public class Ex2 extends AppCompatActivity
{
    TextView tv;
    RadioGroup rg;
    RadioButton rb_etod;
    RadioButton rb_dtoe;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex2);
        tv = findViewById(R.id.textView2);
        rg = findViewById(R.id.radioGroup);
        rb_dtoe = findViewById(R.id.dtoe);
        rb_etod = findViewById(R.id.etod);
        et = findViewById(R.id.valeur);

    }

    public void click_quitter(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, MainActivity.class));
    }
    public void click_convertir(View view)
    {
        int toconvert;
        toconvert = Integer.parseInt(et.getText().toString());
        double resultat;
        if (rb_etod.isChecked())
        {
            resultat =  toconvert*1.14;
        }
        else
        {
            resultat =  toconvert*0.88;
        }
        tv.setText(Double.toString(resultat));

    }
}