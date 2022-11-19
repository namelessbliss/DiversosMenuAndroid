package com.example.proyectoandroid.semana6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoandroid.R;

import java.util.List;

public class FrutasAdapter extends RecyclerView.Adapter<FrutasAdapter.ViewHolder> {

    private final List<Fruta> frutas;
    private final int layout;
    private final Activity activity;

    //Paso el activity en vez del context
    public FrutasAdapter(List<Fruta> frutas, int layout, Activity activity) {
        this.frutas = frutas;
        this.layout = layout;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(activity).inflate(layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(frutas.get(i));
    }

    @Override
    public int getItemCount() {
        return frutas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Elementos de la UI a rellenar
        public TextView textViewNombre;
        public TextView textViewDescripcion;
        public TextView textViewCantidad;
        public ImageView imageViewBackGround;

        public ViewHolder(View view) {
            super(view);
            // Obtiene elementos de la UI
            textViewNombre = itemView.findViewById(R.id.tvNombre);
            textViewDescripcion = itemView.findViewById(R.id.tvDescripcion);
            imageViewBackGround = itemView.findViewById(R.id.imageViewBackground);
        }

        public void bind(final Fruta fruta) {
            textViewNombre.setText(fruta.getNombre());
            textViewDescripcion.setText(fruta.getDescripcion());;
            imageViewBackGround.setImageDrawable(ContextCompat.getDrawable(activity,fruta.getImagenBackground()));
        }
    }
}
