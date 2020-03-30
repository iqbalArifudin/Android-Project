package com.example.android_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//import ini digunakan untuk bisa mengakses webwiew
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android_project.Models.Kategori;

import java.util.ArrayList;
import java.util.List;

public class BeritahasilActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    List<Kategori> teams = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilberita);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("judul")&& getIntent().hasExtra("Detail")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String image_url=getIntent().getStringExtra("image_url");
            String judul = getIntent().getStringExtra("judul");
            String Detail = getIntent().getStringExtra("Detail");
            setImage(image_url, judul, Detail);
        }
    }
    private void setImage(String image_url, String judul, String Detail){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        ImageView img=findViewById(R.id.image);
        TextView jdl= findViewById(R.id.txt_judul);
        TextView detail = findViewById(R.id.txt_detail);
        Glide.with(this).asBitmap().load(image_url).into(img);
        jdl.setText(judul);
        detail.setText(Detail);
    }
}
