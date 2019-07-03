package com.example.aplicacionprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActividadCargar extends AppCompatActivity {

    TextView tvCargarNombre, tvCargarContra, tvMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_cargar);

        tvCargarNombre = findViewById(R.id.tvmostrarNombre);
        tvCargarContra = findViewById(R.id.tvmostrarContraseña);
        tvMensaje= findViewById(R.id.tvmostrarDescr);


        Bundle bundle = this.getIntent().getExtras();
        if (bundle!=null) {
            String nombre = bundle.getString("nombre");
            String contraseña = bundle.getString("pass");

            tvCargarNombre.setText("nombre: "+nombre);
            tvCargarContra.setText("contraseña: " +contraseña);
            tvMensaje.setText("Bienvenido");
        }

    }
}
