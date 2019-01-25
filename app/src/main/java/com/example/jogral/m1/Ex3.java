package com.example.jogral.m1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Jogral on 18/01/2019.
 */

public class Ex3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex3);


    }

    public void click_quitter(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, MainActivity.class));
    }

}