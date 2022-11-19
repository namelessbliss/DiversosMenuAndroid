package com.example.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.proyectoandroid.semana10.Sem10Activity;
import com.example.proyectoandroid.semana13.Sem13Activity;
import com.example.proyectoandroid.semana4.PrimerActivity;
import com.example.proyectoandroid.semana6.ListadoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrSem4(View view) {
        Intent intent = new Intent(this, PrimerActivity.class);
        startActivity(intent);
    }

    public void IrSem6(View view) {
        Intent intent = new Intent(this, ListadoActivity.class);
        startActivity(intent);
    }

    public void IrSem10(View view) {
        Intent intent = new Intent(this, Sem10Activity.class);
        startActivity(intent);
    }    public void IrSem13(View view) {
        Intent intent = new Intent(this, Sem13Activity.class);
        startActivity(intent);
    }
}