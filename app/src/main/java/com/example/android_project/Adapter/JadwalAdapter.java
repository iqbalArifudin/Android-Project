package com.example.android_project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Models.jadwal;
import com.example.android_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.Viewholder> {
    private Context context;
    private List<jadwal> items;

    public JadwalAdapter(Context context, List<jadwal> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public JadwalAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_jadwal, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalAdapter.Viewholder holder, int position) {
        jadwal item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.waktu.setText(item.getWaktu());
        holder.tanggal.setText(item.getTanggal());
        holder.club1.setText(item.getClub1());
        holder.club2.setText(item.getClub2());
        Picasso.get().load(item.getLogo_club1()).into(holder.logo_club1);
        Picasso.get().load(item.getLogo_club2()).into(holder.logo_club2);
        Picasso.get().load(item.getLogotv()).into(holder.logotv);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView logo_club1;
        ImageView logo_club2;
        ImageView logotv;
        TextView waktu;
        TextView tanggal;
        TextView club1;
        TextView club2;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            logo_club1 =itemView.findViewById(R.id.image_logo);
            logo_club2 =itemView.findViewById(R.id.image_logo1);
            logotv=itemView.findViewById(R.id.image_logotv);
            waktu=itemView.findViewById(R.id.text_twaktu);
            tanggal=itemView.findViewById(R.id.text_tgl);
            club1=itemView.findViewById(R.id.club1);
            club2=itemView.findViewById(R.id.club2);
        }
    }
}
