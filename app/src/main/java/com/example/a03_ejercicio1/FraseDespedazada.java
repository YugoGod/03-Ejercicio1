package com.example.a03_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class FraseDespedazada extends AppCompatActivity {

    private TextView txtViewFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase_despedazada);

        txtViewFrase = findViewById(R.id.txtViewFraseDespedazada);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        String frase = bundle.getString("FRASE");

        if (bundle != null){
            if (bundle.getInt("OPERACION") == R.id.btnContarCarácteresMain){
                txtViewFrase.setText("Hay " + contarCaracteres(frase) + " carácteres.");
            }else{
                txtViewFrase.setText("Hay " + contarPalabras(frase) + " palabras.");
            }
        }
    }

    private int contarCaracteres(String frase){
        return frase.trim().length();
    }

    private int contarPalabras(String frase){
        StringTokenizer stringTokenizer = new StringTokenizer(frase);
        return stringTokenizer.countTokens();
    }
}