package com.example.android_project;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.android_project.Models.Hasil;
import com.example.android_project.Models.Kategori;

import java.util.ArrayList;
import java.util.List;

public class DetailhasilActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    List<Hasil> teams = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailhasil);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("image_url1") && getIntent().hasExtra("image_url2") && getIntent().hasExtra("tanggal") && getIntent().hasExtra("score1") && getIntent().hasExtra("namatim1")&& getIntent().hasExtra("score2") && getIntent().hasExtra("namatim2")&& getIntent().hasExtra("gol1") && getIntent().hasExtra("menit1")&& getIntent().hasExtra("gol2") && getIntent().hasExtra("menit2") && getIntent().hasExtra("image_url3") && getIntent().hasExtra("image_url4") && getIntent().hasExtra("namapemain1") && getIntent().hasExtra("no1")&& getIntent().hasExtra("namapemain2") && getIntent().hasExtra("no2") && getIntent().hasExtra("manajer") && getIntent().hasExtra("manajer2")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String image_url1=getIntent().getStringExtra("image_url1");
            String image_url2=getIntent().getStringExtra("image_url2");
            String tanggal=getIntent().getStringExtra("tanggal");
            String score1=getIntent().getStringExtra("score1");
            String namatim1=getIntent().getStringExtra("namatim1");
            String score2=getIntent().getStringExtra("score2");
            String namatim2=getIntent().getStringExtra("namatim2");
            String gol1=getIntent().getStringExtra("gol1");
            String menit1=getIntent().getStringExtra("menit1");
            String gol2=getIntent().getStringExtra("gol2");
            String menit2=getIntent().getStringExtra("menit2");
            String image_url3=getIntent().getStringExtra("image_url3");
            String image_url4=getIntent().getStringExtra("image_url4");
            String namapemain1=getIntent().getStringExtra("namapemain1");
            String no1=getIntent().getStringExtra("no1");
            String namapemain2=getIntent().getStringExtra("namapemain2");
            String no2=getIntent().getStringExtra("no2");
            String manajer=getIntent().getStringExtra("manajer");
            String manajer2=getIntent().getStringExtra("manajer2");
            setImage(image_url1, image_url2, tanggal, score1, namatim1, score2, namatim2, gol1, menit1, gol2, menit2,image_url3,image_url4,namapemain1, no1, namapemain2, no2, manajer, manajer2);
        }
    }

    public void setImage(String image_url1, String image_url2, String tanggal,String score1,String namatim1,String score2,String namatim2,String gol1,String menit1,String gol2,String menit2,String image_url3,String image_url4,String namapemain1,String no1,String namapemain2,String no2,String manajer,String manajer2){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        ImageView image=findViewById(R.id.detail1);
        ImageView img=findViewById(R.id.detail2);
        ImageView foto=findViewById(R.id.timlogo1);
        ImageView ft=findViewById(R.id.timlogo2);
        Glide.with(this).asBitmap().load(image_url1).into(image);
        Glide.with(this).asBitmap().load(image_url2).into(img);
        Glide.with(this).asBitmap().load(image_url3).into(foto);
        Glide.with(this).asBitmap().load(image_url4).into(ft);
        TextView tgl=findViewById(R.id.text_tanggal);
        tgl.setText(tanggal);
        TextView sc1=findViewById(R.id.detailscore1);
        sc1.setText(score1);
        TextView sc2=findViewById(R.id.detailscore2);
        sc2.setText(score2);
        TextView nmt1=findViewById(R.id.timdetail1);
        nmt1.setText(namatim1);
        TextView nmt2=findViewById(R.id.timdetail2);
        nmt2.setText(namatim2);
        TextView g1=findViewById(R.id.gol1);
        g1.setText(gol1);
        TextView mn1=findViewById(R.id.menit1);
        mn1.setText(menit1);
        TextView g2=findViewById(R.id.gol2);
        g2.setText(gol2);
        TextView mn2=findViewById(R.id.menit2);
        mn2.setText(menit2);
        TextView nmp1=findViewById(R.id.namapemain);
        nmp1.setText(namapemain1);
        TextView no=findViewById(R.id.nomorpunggung1);
        no.setText(no1);
        TextView nmp2=findViewById(R.id.namapemain2);
        nmp2.setText(namapemain2);
        TextView np2=findViewById(R.id.nomorpunggung2);
        np2.setText(no2);
        TextView mnaj1=findViewById(R.id.manajer1);
        mnaj1.setText(manajer);
        TextView mnaj2=findViewById(R.id.manajer2);
        mnaj2.setText(manajer2);
    }
}
