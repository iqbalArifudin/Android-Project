package com.example.android_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.TransferAdapter;
import com.example.android_project.Models.Transfer;

import java.util.ArrayList;
import java.util.List;

public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Transfer> teams = new ArrayList<>();
        teams.add(new Transfer("https://www.wearemania.net/wp-content/uploads/2020/01/20200110_Kushedya-Hari-Yudo-Dinilai-Pantas-Gabung-Arema.jpg", "https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png", "https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png"));
        teams.add(new Transfer("https://d10dnch8g6iuzs.cloudfront.net/picture/18820191015101017342/width/480/height/306", "https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png", "https://upload.wikimedia.org/wikipedia/id/3/3f/Persita_Tangerang_logo_%28baru%29.png"));
        teams.add(new Transfer("https://thumb.viva.co.id/media/frontend/thumbs3/2017/07/03/5959f558c40c1-gelandang-bhayangkara-fc-evan-dimas-darmono_665_374.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://2.bp.blogspot.com/-WHHlOg5hXko/WfLWX4dd-WI/AAAAAAAACbw/bu917eQ6FMEyXjy7N_V8zBYcs0vv6wuCQCLcBGAs/s1600/Persija%2BCDR.png"));
        teams.add(new Transfer("https://asset-a.grid.id/crop/0x0:750x620/700x465/photo/2019/04/11/3787915677.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/id/0/08/Logo_Persipura_Jayapura.png"));
        teams.add(new Transfer("https://www.galamedianews.com/media/original/200116111846-akhir.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/id/f/f8/Logo_Persebaya_Surabaya.png"));
        teams.add(new Transfer("https://radarmalang.id/file/2018/11/12-FOTO-A-RIVALDI-BAWUO.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/en/thumb/9/9d/Madura_United_F.C._logo.png/220px-Madura_United_F.C._logo.png"));
        teams.add(new Transfer("https://cdn2.tstatic.net/suryamalang/foto/bank/images2/elias-alderete-dari-atletico-chacarita-juniors-dikabarkan-merapat-ke-arema-fc.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png"));
        teams.add(new Transfer("https://d10dnch8g6iuzs.cloudfront.net/picture/48420190415011702444/width/480/height/306","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/id/f/f3/Logo_Bhayangkara_FC.png"));
        teams.add(new Transfer("https://cdn-radar.jawapos.com/uploads/radarkediri/news/2020/03/02/resmi-main-di-stadion-brawijaya-persik-waspada-strategi-bfc_m_181795.jpg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/id/thumb/c/cd/Logo_Persik_Kediri.png/1200px-Logo_Persik_Kediri.png"));
        teams.add(new Transfer("https://asset.kompas.com/crops/UMVBP-cQS_g6Vmqd1n-C9UzonSQ=/0x11:1079x730/750x500/data/photo/2020/01/29/5e30998a2a388.jpeg","https://santamonicaseafood.com/wp-content/uploads/2017/06/grey-right-arrow-hi1.png","https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Persela_logo.svg/1200px-Persela_logo.svg.png"));
        TransferAdapter adapter=new TransferAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
