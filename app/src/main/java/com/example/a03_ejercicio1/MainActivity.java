package com.example.a03_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Atributos para las vistas.
    private EditText txtFrase;
    private Button btnContarPalabras;
    private Button btnContarCaracteres;

    // Constantes
    public static final int PALABRAS = 1;
    public static final int CARACTERES = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualizaVistas();
        // inicializaEventos();
    }

    private void inicializaEventos() {
        btnContarCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclick(CARACTERES);
            }
        });

        btnContarPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclick(PALABRAS);
            }
        });
    }

    private void onclick(int c ) {
        String frase = txtFrase.getText().toString();

        if (!frase.trim().isEmpty()){
            Intent intent = new Intent(MainActivity.this, FraseDespedazada.class);
            Bundle bundle = new Bundle();
            bundle.putString("FRASE",frase);
            bundle.putInt("OPERACION", c);
            intent.putExtras(bundle);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Esta vacío.", Toast.LENGTH_SHORT).show();
        }
    }

    private void visualizaVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnContarPalabras = findViewById(R.id.btnContarPalabrasMain);
        btnContarCaracteres = findViewById(R.id.btnContarCarácteresMain);
    }

    public void onClickBotones(View boton){
        String frase = txtFrase.getText().toString();

        if (!frase.trim().isEmpty()){
            Intent intent = new Intent(MainActivity.this, FraseDespedazada.class);
            Bundle bundle = new Bundle();
            bundle.putString("FRASE",frase);

            // Cada botón inserta su ID.
            bundle.putInt("OPERACION", boton.getId());
            intent.putExtras(bundle);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Esta vacío.", Toast.LENGTH_SHORT).show();
        }
    }
}