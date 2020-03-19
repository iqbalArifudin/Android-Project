package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.KategoriAdapter;
import com.example.android_project.Models.Kategori;
import com.example.android_project.R;

import java.util.ArrayList;
import java.util.List;

public class KategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Kategori> teams = new ArrayList<>();
        teams.add(new Kategori("http://infobola82.blogspot.com/2015/08/Agen-bola-terpercaya-prediksi-liga-inggris-8agust2015.html", "Premier League"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/id/3/3e/Bundesliga-Logo-2010.png", "Bundes Liga"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/id/3/35/La_Liga.png", "LaLiga Santander"));
        teams.add(new Kategori("https://warungvector1.blogspot.com/2018/04/logo-ligue-1-conforama-vector-cdr-png-hd.html", "Ligue 1 Conforama"));
        teams.add(new Kategori("https://fifa.fandom.com/wiki/Football_League_Championship?file=EFL_Championship_Logo.png", "SkyBET Championship"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/id/e/e1/Serie_A_logo_%282019%29.svg", "Serie A"));
        teams.add(new Kategori("https://pngimage.net/wp-content/uploads/2018/06/ligue-2-logo-png-7.png", "Domino's Ligue 2"));
        teams.add(new Kategori("https://en.wikipedia.org/wiki/Serie_B#/media/File:Serie_BKT.svg", "Serie B"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/commons/0/0e/Liga_NOS_logo.png", "Liga NOS"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/commons/d/d1/Eredivisie_Logo_2017-.png", "Eridivisie"));
        teams.add(new Kategori("https://upload.wikimedia.org/wikipedia/id/7/74/Liga_1_Shopee.png", "Shopee Liga 1"));
        teams.add(new Kategori("https://en.wikipedia.org/wiki/Liga_2_(Indonesia)#/media/File:Liga_2_Indonesia_logo.png", "Liga 2 Indonesia"));
        KategoriAdapter adapter=new KategoriAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
