package com.example.a03_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtFrase;
    private Button btnContarPalabras;
    private Button btnContarCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualizaVistas();

        btnContarPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnContarCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                Intent intent = new Intent(MainActivity.this, FraseDespedazada.class);
                Bundle bundle = new Bundle();
                bundle.putString("AZUCAR",frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnContarPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                Intent intent = new Intent(MainActivity.this, FraseDespedazada.class);
                Bundle bundle = new Bundle();
                bundle.putString("AZUCAR2",frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void visualizaVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnContarPalabras = findViewById(R.id.btnContarPalabrasMain);
        btnContarCaracteres = findViewById(R.id.btnContarCarácteresMain);
    }
}