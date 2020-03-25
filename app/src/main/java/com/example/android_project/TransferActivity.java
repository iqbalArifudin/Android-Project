package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.TransferAdapter;
import com.example.android_project.Models.Kategori;

import java.util.ArrayList;
import java.util.List;

public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Kategori> teams = new ArrayList<>();
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png", "Arema FC"));

        TransferAdapter adapter=new TransferAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
