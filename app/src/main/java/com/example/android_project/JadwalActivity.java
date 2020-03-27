package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.JadwalAdapter;
import com.example.android_project.Models.jadwal;

import java.util.ArrayList;
import java.util.List;

public class JadwalActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<jadwal> teams = new ArrayList<>();
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png","https://upload.wikimedia.org/wikipedia/id/f/f8/Logo_Persebaya_Surabaya.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","15.30","27 Maret 2020","Arema fc","Persebaya" ));
        teams.add(new jadwal("https://2.bp.blogspot.com/-WHHlOg5hXko/WfLWX4dd-WI/AAAAAAAACbw/bu917eQ6FMEyXjy7N_V8zBYcs0vv6wuCQCLcBGAs/s1600/Persija%2BCDR.png","https://upload.wikimedia.org/wikipedia/id/1/12/Logo_Persib.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","18.30","27 Maret 2020","Persija","Persib Banndung" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/thumb/c/cd/Logo_Persik_Kediri.png/1200px-Logo_Persik_Kediri.png","https://upload.wikimedia.org/wikipedia/id/f/f3/Logo_Bhayangkara_FC.png","https://upload.wikimedia.org/wikipedia/commons/1/1f/Ochannel.png","18.30","28 Maret 2020","Persik","Bhayangkara" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/commons/8/85/Logo_PSIS_Semarang_hd.png","https://upload.wikimedia.org/wikipedia/id/4/4e/Logo-persiraja.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","15.30","29 Maret 2020","PSIS Semaarang","Persiraja" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/c/cb/Logo_Persela_baru.png","https://upload.wikimedia.org/wikipedia/id/3/3f/Persita_Tangerang_logo_%28baru%29.png","https://upload.wikimedia.org/wikipedia/commons/1/1f/Ochannel.png","18.30","29 Maret 2020","Persela","Persita" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/thumb/5/5e/Bali_United_logo.svg/1200px-Bali_United_logo.svg.png","https://upload.wikimedia.org/wikipedia/id/2/23/Logo_Borneo_FC.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","15.30","2 April 2020","Bali united","Borneo FC" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/en/thumb/9/9d/Madura_United_F.C._logo.png/220px-Madura_United_F.C._logo.png","https://i0.wp.com/suarapapua.com/wp-content/uploads/2019/07/persipura-jayapura-5ba4ae76e85d1.png?resize=304%2C235&ssl=1","https://upload.wikimedia.org/wikipedia/commons/1/1f/Ochannel.png","18.30","2 April 2020","Madura United","Persipura" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/b/b8/Logo_PSM_Makasar_Baru.png","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Logo-pss-vector.svg/1200px-Logo-pss-vector.svg.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","15.30","3 April 2020","PSM Makasar","PSS Selman" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/en/thumb/d/dd/TIRA-Persikabo_logo.svg/1200px-TIRA-Persikabo_logo.svg.png","https://upload.wikimedia.org/wikipedia/en/thumb/d/d6/Barito_Putera_logo.svg/1200px-Barito_Putera_logo.svg.png","https://upload.wikimedia.org/wikipedia/commons/1/1f/Ochannel.png","18.30","6 April 2020","PS Tirakabo","Barito Putra" ));
        teams.add(new jadwal("https://upload.wikimedia.org/wikipedia/id/2/23/Logo_Borneo_FC.png","https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png","https://upload.wikimedia.org/wikipedia/id/0/03/INDOSIAR_1996.png","18.30","9 April 2020","Borneo FC","Areema FC" ));
        JadwalAdapter adapter = new JadwalAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);

    }
}
