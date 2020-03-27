package com.example.android_project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Models.Hasil;
import com.example.android_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HasilAdapter extends RecyclerView.Adapter<HasilAdapter.ViewHolder> {

    private Context context;
    private List<Hasil> items;

    public HasilAdapter(Context context, List<Hasil> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public HasilAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hasil, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HasilAdapter.ViewHolder holder, int position) {
        Hasil item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.club1.setText(item.getClub1());
        holder.club2.setText(item.getClub2());
        holder.score1.setText(item.getScore1());
        holder.score2.setText(item.getScore2());
        holder.fulltime.setText(item.getFulltime());
        holder.tanggal.setText(item.getTanggal());
        Picasso.get().load(item.getLogo_club1()).into(holder.logo_club1);
        Picasso.get().load(item.getLogo_club2()).into(holder.logo_club2);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo_club1;
        ImageView logo_club2;
        TextView club1;
        TextView club2;
        TextView score1;
        TextView score2;
        TextView fulltime;
        TextView tanggal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo_club1=itemView.findViewById(R.id.logo_club1);
            logo_club2=itemView.findViewById(R.id.logo_club2);
            club1=itemView.findViewById(R.id.text_club1);
            club2=itemView.findViewById(R.id.text_club2);
            score1=itemView.findViewById(R.id.score1);
            score2=itemView.findViewById(R.id.score2);
            fulltime=itemView.findViewById(R.id.fulltime);
            tanggal=itemView.findViewById(R.id.tanggal);
        }
    }
}
