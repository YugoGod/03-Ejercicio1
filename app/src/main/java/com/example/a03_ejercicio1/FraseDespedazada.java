package com.example.a03_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class FraseDespedazada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase_despedazada);
        
        visualizaVistas();

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            if (bundle.containsKey("AZUCAR")){
                Toast.makeText(this, "Azucar 1 funciona", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Azucar 2 funciona", Toast.LENGTH_SHORT).show();
            }
            
        }
        
    }

    private void visualizaVistas() {
    }
}