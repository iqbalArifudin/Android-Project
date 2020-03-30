package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.HasilAdapter;
import com.example.android_project.Models.Hasil;

import java.util.ArrayList;
import java.util.List;

public class HasilActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Hasil> teams = new ArrayList<>();
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png","https://upload.wikimedia.org/wikipedia/id/thumb/5/5e/Bali_United_logo.svg/1200px-Bali_United_logo.svg.png","Arema FC","Bali United","2","1","FT","Kam, 12/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/f/f3/Logo_Bhayangkara_FC.png","https://2.bp.blogspot.com/-WHHlOg5hXko/WfLWX4dd-WI/AAAAAAAACbw/bu917eQ6FMEyXjy7N_V8zBYcs0vv6wuCQCLcBGAs/s1600/Persija%2BCDR.png","Bhayangkara FC","Persija Jakarta","2","2","FT","Sab, 14/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/b/b8/Logo_PSM_Makasar_Baru.png","https://upload.wikimedia.org/wikipedia/en/thumb/d/d6/Barito_Putera_logo.svg/1200px-Barito_Putera_logo.svg.png","PSM Makassar","Barito Putra","1","1","FT","Min, 15/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/1/12/Logo_Persib.png","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Logo-pss-vector.svg/1200px-Logo-pss-vector.svg.png","Persib Bandung","PSS","2","1","FT","Min, 15/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/f/f8/Logo_Persebaya_Surabaya.png","https://i0.wp.com/suarapapua.com/wp-content/uploads/2019/07/persipura-jayapura-5ba4ae76e85d1.png?resize=304%2C235&ssl=1","Persebaya","Persipura","3","4","FT","Jum, 13/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/thumb/c/cd/Logo_Persik_Kediri.png/1200px-Logo_Persik_Kediri.png","https://upload.wikimedia.org/wikipedia/id/4/4e/Logo-persiraja.png","Persik","Persiraja","0","1","FT","Sab, 14/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/thumb/5/5e/Bali_United_logo.svg/1200px-Bali_United_logo.svg.png","https://upload.wikimedia.org/wikipedia/en/thumb/9/9d/Madura_United_F.C._logo.png/220px-Madura_United_F.C._logo.png","Bali United","Madura United","3","1","FT","Min, 15/3"));
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/en/thumb/d/dd/TIRA-Persikabo_logo.svg/1200px-TIRA-Persikabo_logo.svg.png","https://upload.wikimedia.org/wikipedia/id/3/3f/Persita_Tangerang_logo_%28baru%29.png","Tira-Kabo","Persita","3","1","FT","Min, 15/3"));
        HasilAdapter adapter=new HasilAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);

    }
}
