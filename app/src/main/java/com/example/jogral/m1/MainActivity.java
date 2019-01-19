package com.example.jogral.m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_ex1(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, Ex1.class));
    }
    public void click_ex2(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, Ex2.class));
    }
}
