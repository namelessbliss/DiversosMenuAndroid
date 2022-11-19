package com.example.proyectoandroid.semana4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.proyectoandroid.R;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nombre", "");
        String apellido = bundle.getString("apellido", "");

        TextView tvNombre = findViewById(R.id.textView3);
        TextView tvapellido = findViewById(R.id.textView4);
        tvNombre.setText("Tu nombre es: "+nombre);
        tvapellido.setText("Tu nombre es: "+apellido);
    }
}