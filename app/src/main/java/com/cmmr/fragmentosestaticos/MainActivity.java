package com.cmmr.fragmentosestaticos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enviarDato(String datos){

        FragmentoB fb = (FragmentoB) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
        fb.recibir(datos);

    }

}