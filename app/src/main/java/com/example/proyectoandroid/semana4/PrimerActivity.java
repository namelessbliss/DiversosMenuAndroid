package com.example.proyectoandroid.semana4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.proyectoandroid.R;

public class PrimerActivity extends AppCompatActivity {

    private EditText etNombre, etApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer);
        etNombre = findViewById(R.id.editTextTextPersonName);
        etApellido = findViewById(R.id.editTextTextPersonName2);
    }

    public void EnviarDatos(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("nombre", etNombre.getText().toString());
        bundle.putString("apellido", etApellido.getText().toString());
        Intent intent = new Intent(this, SegundoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}