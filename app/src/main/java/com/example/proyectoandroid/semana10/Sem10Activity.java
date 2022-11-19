package com.example.proyectoandroid.semana10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.proyectoandroid.R;
import com.example.proyectoandroid.semana4.PrimerActivity;

public class Sem10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem10);
    }

    public void IrTabActivity(View view) {
        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }

    public void IrBottomNav(View view) {
        Intent intent = new Intent(this, BottomNavActivity.class);
        startActivity(intent);
    }

    public void IrNavDrawer(View view) {
        Intent intent = new Intent(this, NavDrawerActivity.class);
        startActivity(intent);
    }
}