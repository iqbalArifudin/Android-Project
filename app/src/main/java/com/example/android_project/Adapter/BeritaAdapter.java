package com.example.android_project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Models.Kategori;
import com.example.android_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.ViewHolder> {
    private Context context;
    private List<Kategori> items;
    private static final int LOGO_LEFT = 1;
    private static final int LOGO_RIGHT = 2;

    public BeritaAdapter(Context context, List<Kategori> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BeritaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == LOGO_LEFT) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_berita, parent, false);
        } else if (viewType == LOGO_RIGHT) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_reversed, parent, false);
        }
        return new BeritaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeritaAdapter.ViewHolder holder, int position) {
            Kategori item=items.get(position);
            holder.nameText.setText(item.getName());
            Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
            return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 2 == 0) ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
