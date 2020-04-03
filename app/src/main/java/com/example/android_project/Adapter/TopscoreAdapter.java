package com.example.android_project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.android_project.Models.Topscore;
import com.example.android_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TopscoreAdapter extends RecyclerView.Adapter<TopscoreAdapter.ViewHolder> {
    private Context context;
    private List<Topscore> items;

    public TopscoreAdapter(Context context, List<Topscore> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public TopscoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_topscore, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopscoreAdapter.ViewHolder holder, int position) {
        Topscore item=items.get(position);
        holder.nama.setText(item.getNama());
        holder.club.setText(item.getClub());
        holder.goal.setText(item.getGoal());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nama;
        TextView club;
        TextView goal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage=itemView.findViewById(R.id.image_logo);
            nama=itemView.findViewById(R.id.text_nama);
            club=itemView.findViewById(R.id.text_club);
            goal=itemView.findViewById(R.id.text_goal);
        }
    }
}
