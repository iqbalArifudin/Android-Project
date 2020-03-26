package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.TopscoreAdapter;
import com.example.android_project.Models.Kategori;
import com.example.android_project.Models.Topscore;

import java.util.ArrayList;
import java.util.List;

public class TopscoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topscore);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Topscore> teams = new ArrayList<>();
        teams.add(new Topscore("https://www.galamedianews.com/media/original/200308174632-penal.jpg", "Wander Luiz","Persib Bandung","Gol : 4"));
        teams.add(new Topscore("https://faktualnews.co/images/2020/01/beto.jpg", "Alberto 'Beto' Goncalves", "Madura United" , "Gol : 3"));
        teams.add(new Topscore("https://cdn1-production-images-kly.akamaized.net/UrcevbY8AmJ36z7jJacNOPiobBw=/0x0:0x0/640x480/filters:quality(75):strip_icc():format(jpeg):watermark(kly-media-production/assets/images/watermarks/bola/watermark-color-square-new.png,565,20,0)/kly-media-production/medias/3066496/original/099799700_1583216271-20200302IQ_Tira_Persikabo_Vs_Arema_FC_09.jpg", "Kushedya Hari Yudo","Arema FC" , "Gol : 2"));
        teams.add(new Topscore("https://images.daznservices.com/di/library/GOAL/fa/fa/javlon-guseynov-borneo-fc_4h4tf8v25ima1pn7ama0q0kwb.jpg?t=377937915&quality=60&w=1200&h=800", "Francisco Torres","Borneo FC","Gol : 2"));
        teams.add(new Topscore("https://cdn-radar.jawapos.com/uploads/radarbali/news/2020/03/07/golnya-kembali-dianulir-wasit-melvin-platje-syukur-kami-bisa-menang_m_182651.jpg", "Melvin Platje","Bali United","Gol : 2"));
        teams.add(new Topscore("https://barta1.com/wp-content/uploads/2020/03/amaral-Persebaya-vs-Persipura.jpg", "Thiago Amaral","Persipura Jayapura","Gol : 2"));
        teams.add(new Topscore("https://persija.id/wp-content/uploads/2020/03/evan-dimas.jpg", "Evan Dimas","Persija Jakarta","Gol : 2"));
        teams.add(new Topscore("https://asset.indosport.com/article/image/q/80/261613/selebrasi_striker_psis_semaran-169.jpg?w=750&h=423", "Bruno Silva","PSIS Semarang" , "Gol : 2"));

        TopscoreAdapter adapter=new TopscoreAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
