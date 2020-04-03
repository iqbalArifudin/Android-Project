package com.example.android_project.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.android_project.DetailhasilActivity;
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
        final Hasil item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.club1.setText(item.getClub1());
        holder.club2.setText(item.getClub2());
        holder.score1.setText(item.getScore1());
        holder.score2.setText(item.getScore2());
        holder.fulltime.setText(item.getFulltime());
        holder.tanggal.setText(item.getTanggal());
        Glide.with(context).load(item.getLogo_club1()).into(holder.logo_club1);
        Glide.with(context).load(item.getLogo_club2()).into(holder.logo_club2);
        //On Click
        holder.layout_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailhasilActivity.class);
                intent.putExtra("image_url1", item.getLogo_club1());
                intent.putExtra("image_url2", item.getLogo_club2());
                intent.putExtra("image_url3", item.getLogo_club1());
                intent.putExtra("image_url4", item.getLogo_club2());
                intent.putExtra("tanggal", item.getTanggal());
                intent.putExtra("score1", item.getScore1());
                intent.putExtra("namatim1", item.getClub1());
                intent.putExtra("score2", item.getScore2());
                intent.putExtra("namatim2", item.getClub2());
                intent.putExtra("gol1", item.getGol1());
                intent.putExtra("menit1", item.getMenit1());
                intent.putExtra("gol2", item.getGol2());
                intent.putExtra("menit2", item.getMenit2());
                intent.putExtra("namapemain1", item.getPemain1());
                intent.putExtra("no1", item.getPunggung1());
                intent.putExtra("namapemain2", item.getPemain2());
                intent.putExtra("no2", item.getPunggung2());
                intent.putExtra("manajer", item.getManajer());
                intent.putExtra("manajer2", item.getManajer2());
                context.startActivity(intent);
            }
        });
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
        CardView layout_detail;
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
            layout_detail=itemView.findViewById(R.id.layout_detailhasil);
        }
    }
}
