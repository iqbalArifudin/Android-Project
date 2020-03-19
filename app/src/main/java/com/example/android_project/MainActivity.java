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

    public void handleKategori(View view) {
        Intent intent = new Intent(this, KategoriActivity.class);
        startActivity(intent);
    }

    public void handleBerita(View view){
        Intent intent = new Intent(this, PremierActivity.class);
        startActivity(intent);
    }
}
