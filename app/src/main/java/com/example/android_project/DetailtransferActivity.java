package com.example.android_project;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.android_project.Models.Transfer;

import java.util.ArrayList;
import java.util.List;

public class DetailtransferActivity extends AppCompatActivity {
    private static final String TAG="DetailTransferActivity";
    List<Transfer> teams=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferdetail);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("nama") && getIntent().hasExtra("club")  && getIntent().hasExtra("posisi") && getIntent().hasExtra("harga") && getIntent().hasExtra("status")){
            String image_url=getIntent().getStringExtra("image_url");
            String nama=getIntent().getStringExtra("nama");
            String club=getIntent().getStringExtra("club");
            String posisi=getIntent().getStringExtra("posisi");
            String harga=getIntent().getStringExtra("harga");
            String status=getIntent().getStringExtra("status");
            setImage(image_url, nama, club, posisi, harga, status);
        }
    }

    private void setImage(String image_url, String nama,String club,String posisi,String harga,String status){
        ImageView image=findViewById(R.id.image_pemain);
        TextView nm=findViewById(R.id.textnama);
        TextView cl=findViewById(R.id.textclub);
        TextView ps=findViewById(R.id.txt_posisi);
        TextView hrg=findViewById(R.id.txt_harga);
        TextView st=findViewById(R.id.txt_Status);
        Glide.with(this).asBitmap().load(image_url).into(image);
        nm.setText(nama);
        cl.setText(club);
        ps.setText(posisi);
        hrg.setText(harga);
        st.setText(status);
    }
}
