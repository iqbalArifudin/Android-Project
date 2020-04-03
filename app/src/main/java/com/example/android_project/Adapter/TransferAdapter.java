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

import com.example.android_project.DetailtransferActivity;
import com.example.android_project.Models.Kategori;
import com.example.android_project.Models.Transfer;
import com.example.android_project.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TransferAdapter extends RecyclerView.Adapter<TransferAdapter.ViewHolder> {
    private Context context;
    private List<Transfer> items;

    public TransferAdapter(Context context, List<Transfer> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public TransferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_transfer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransferAdapter.ViewHolder holder, int position) {
        final Transfer item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
//        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo_pemain()).into(holder.logoImage1);
        Picasso.get().load(item.getLogo()).into(holder.logoImage2);
        Picasso.get().load(item.getLogo_team()).into(holder.logoImage3);
        //on click
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailtransferActivity.class);
                intent.putExtra("image_url", item.getLogo_pemain());
                intent.putExtra("nama", item.getNama());
                intent.putExtra("club", item.getClub());
                intent.putExtra("posisi", item.getPosisi());
                intent.putExtra("harga", item.getHarga());
                intent.putExtra("status", item.getStatus());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage1;
        ImageView logoImage2;
        ImageView logoImage3;
        CardView layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage1 = itemView.findViewById(R.id.image_logo1);
            logoImage2 = itemView.findViewById(R.id.image_logo2);
            logoImage3 = itemView.findViewById(R.id.image_logo3);
            layout=itemView.findViewById(R.id.layout);
        }
    }
}
