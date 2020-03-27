package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleBerita(View view) {
        Intent intent = new Intent(this, BeritaActivity.class);
        startActivity(intent);
    }

    public void handleTransfer(View view) {
        Intent intent = new Intent(this, TransferActivity.class);
        startActivity(intent);
    }

    public void handleJadwal(View view) {
        Intent intent = new Intent(this, JadwalActivity.class);
        startActivity(intent);
    }

    public void handleHasil(View view) {
        Intent intent = new Intent(this, HasilActivity.class);
        startActivity(intent);
    }

    public void handleTop(View view) {
        Intent intent = new Intent(this, TopscoreActivity.class);
        startActivity(intent);
    }
}
