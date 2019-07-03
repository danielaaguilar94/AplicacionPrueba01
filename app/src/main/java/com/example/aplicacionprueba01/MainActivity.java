package com.example.aplicacionprueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtContraseña;
    TextView tvNombre, tvContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre= findViewById(R.id.etUsuario);
        txtContraseña=findViewById(R.id.etContraseña);

        tvNombre=findViewById(R.id.tvResulNombre);
        tvContraseña=findViewById(R.id.tvResulContra);
    }

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnGuardar:
                String nombre = txtNombre.getText().toString();
                String contraseña = txtContraseña.getText().toString();
                tvNombre.setText(nombre);
                tvContraseña.setText(contraseña);
                break;

            case R.id.btnCargar:

                Intent intent = new Intent(this, ActividadCargar.class);
                Bundle bundle = new Bundle();
                bundle.putString("nombre",txtNombre.getText().toString());
                bundle.putString("pass",txtContraseña.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }
    }

    /*
    private void limpiarCajas() {
        txtNombre.setText("");
        txtContraseña.setText("");
    }*/
}
