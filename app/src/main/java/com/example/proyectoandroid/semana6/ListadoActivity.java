package com.example.proyectoandroid.semana6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyectoandroid.R;

import java.util.ArrayList;
import java.util.List;

public class ListadoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private FrutasAdapter adaptador;

    private List<Fruta> frutas;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        frutas = this.getFrutas();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);

        adaptador = new FrutasAdapter(frutas, R.layout.recycler_view_item_fruta, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adaptador);

        //implementacion del ContextMenu movido al ViewHolder
    }

    private List<Fruta> getFrutas() {
        return new ArrayList<Fruta>() {{
            add(new Fruta("Manzana", "Descripcion manzana", R.drawable.manzana, R.mipmap.ic_apple));
            add(new Fruta("Banana", "Descripcion banana", R.drawable.banana, R.mipmap.ic_banana));
            add(new Fruta("Ceresa", "Descripcion ceresa", R.drawable.ceresa, R.mipmap.ic_cherry));
            add(new Fruta("Fresa", "Descripcion fresa", R.drawable.fresa, R.mipmap.ic_strawberry));
            add(new Fruta("Naranja", "Descripcion manzana", R.drawable.naranja, R.mipmap.ic_orange));
            add(new Fruta("Pera", "Descripcion pera", R.drawable.pera, R.mipmap.ic_pear));
            add(new Fruta("sandia", "Descripcion sandia", R.drawable.sandia, R.mipmap.ic_sandia));
        }};
    }
}