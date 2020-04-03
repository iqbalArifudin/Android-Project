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
        teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png","https://upload.wikimedia.org/wikipedia/id/thumb/5/5e/Bali_United_logo.svg/1200px-Bali_United_logo.svg.png","Arema FC","Bali United","2","2","FT","Kam, 12/3","Kushedya Yudo","Stefano Lilipaly \n" +
                "\n" + "Lerby Eliandry","15' 66'" ,"10'\n" +
                "\n" + "20'" ,"10 \n" +
                "\n" + "99 \n" +
                "\n" + "41 \n" +
                "\n" + "16 \n" +
                "\n" + "7 \n" +
                "\n" + "12 \n" +
                "\n" + "87 \n" +
                "\n" + "5 \n" +
                "\n" + "19 \n" +
                "\n" + "4 \n" +
                "\n" + "23" , "M Rafli \n" +
                "\n" + "K. Yudo \n" +
                "\n" + "D. Santoso \n" +
                "\n" + "R. Tawainella \n" +
                "\n" + "Oh in-kyun \n" +
                "\n" + "H. Siswanto \n" +
                "\n" + "J. Alfarizi \n" +
                "\n" + "B. Nugroho \n" +
                "\n" + "H. Abdurarauf \n" +
                "\n" + "S. Cahya \n" +
                "\n" + "T. Amirudin"
                , "87 \n" +
                "\n" + "23 \n" +
                "\n" + "10 \n" +
                "\n" + "7 \n" +
                "\n" + "14 \n" +
                "\n" + "6 \n" +
                "\n" + "43 \n" +
                "\n" + "24 \n" +
                "\n" + "32 \n" +
                "\n" + "22 \n" +
                "\n" + "59" , "S. Lilipaly \n" +
                "\n" + "F. Al-Ayyubi \n" +
                "\n" + "L. Baru \n" +
                "\n" + "M. Platje \n" +
                "\n" + "F. Sausu \n" +
                "\n" + "Brwa Nouri \n" +
                "\n" + "Willian \n" +
                "\n" + "R. Fajrin \n" +
                "\n" + "L. Tupamahu \n" +
                "\n" + "D. Angga Putra \n" +
                "\n" + "W. Hendrawan","R. Gómez","A. Cugurra Rodrigues"));
            teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/f/f3/Logo_Bhayangkara_FC.png","https://2.bp.blogspot.com/-WHHlOg5hXko/WfLWX4dd-WI/AAAAAAAACbw/bu917eQ6FMEyXjy7N_V8zBYcs0vv6wuCQCLcBGAs/s1600/Persija%2BCDR.png","Bhayangkara FC","Persija Jakarta","2","2","FT","Sab, 14/3","Renan da Silva \n"+
                    "\n" + "Ezechiel N'Douassel","Otavio Dutra \n" +
                    "\n" + "Evan Dimas","20' \n" +
                    "\n "+ "69","52'\n" +
                    "\n" + "64'" ,"29 \n" +
                    "\n" + "10 \n" +
                    "\n" + "19 \n" +
                    "\n" + "70 \n" +
                    "\n" + "71 \n" +
                    "\n" + "18 \n" +
                    "\n" + "14 \n" +
                    "\n" + "15 \n" +
                    "\n" + "16 \n" +
                    "\n" + "2 \n" +
                    "\n" + "12" , "S. Ramdani \n" +
                    "\n" + "E. N'Douassel \n" +
                    "\n" + "T. Ichsan \n" +
                    "\n" + "R. da Silva \n" +
                    "\n" + "N. Herve \n" +
                    "\n" + "A. Setyano \n" +
                    "\n" + "R. Sanadi \n" +
                    "\n" + "Lee Won-Jae \n" +
                    "\n" + "A. Jufriyanto \n" +
                    "\n" + "P. Gede \n" +
                    "\n" + "A. Raharjo"
                    , "46 \n" +
                    "\n" + "9 \n" +
                    "\n" + "25 \n" +
                    "\n" + "32 \n" +
                    "\n" + "10 \n" +
                    "\n" + "6 \n" +
                    "\n" + "28 \n" +
                    "\n" + "5 \n" +
                    "\n" + "4 \n" +
                    "\n" + "47 \n" +
                    "\n" + "26" , "O. Haay \n" +
                    "\n" + "M. Simic \n" +
                    "\n" + "R. Simanjuntak \n" +
                    "\n" + "R. Chand \n" +
                    "\n" + "M. Klok \n" +
                    "\n" + "E. Dimas \n" +
                    "\n" + "R. Hehanusa \n" +
                    "\n" + "O. Dutra \n" +
                    "\n" + "R. Prabowo \n" +
                    "\n" + "M. Motta \n" +
                    "\n" + "A. Ardyansyah","P. Munster","S. Farias"));
            teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/b/b8/Logo_PSM_Makasar_Baru.png","https://upload.wikimedia.org/wikipedia/en/thumb/d/d6/Barito_Putera_logo.svg/1200px-Barito_Putera_logo.svg.png","PSM Makassar","Barito Putra","1","1","FT","Min, 15/3","Giancarlo Lopes Rodrigues","Ambrizal Umanailo" ,"38'" ,"35'" ,"9 \n" +
                    "\n" + "11 \n" +
                    "\n" + "10 \n" +
                    "\n" + "27 \n" +
                    "\n" + "80 \n" +
                    "\n" + "22 \n" +
                    "\n" + "25 \n" +
                    "\n" + "21 \n" +
                    "\n" + "5 \n" +
                    "\n" + "14 \n" +
                    "\n" + "33" , "Giancarlo \n" +
                    "\n" + "O. Ikpefua \n" +
                    "\n" + "E. Wallian \n" +
                    "\n" + "A. Agung \n" +
                    "\n" + "W. Pluim \n" +
                    "\n" + "Y. Sayuri \n" +
                    "\n" + "L. Guntara \n" +
                    "\n" + "S. Hasic \n" +
                    "\n" + "Husein El Dor \n" +
                    "\n" + "A. Bahar \n" +
                    "\n" + "M. Saputra"
                    , "66 \n" +
                    "\n" + "9 \n" +
                    "\n" + "11 \n" +
                    "\n" + "26 \n" +
                    "\n" + "24 \n" +
                    "\n" + "13 \n" +
                    "\n" + "7 \n" +
                    "\n" + "35 \n" +
                    "\n" + "5 \n" +
                    "\n" + "89 \n" +
                    "\n" + "1" , "B. Kaffa \n" +
                    "\n" + "A. Rakic \n" +
                    "\n" + "Yaser Islame \n" +
                    "\n" + "R. Pora \n" +
                    "\n" + "D. Sekullic \n" +
                    "\n" + "B. Pradana \n" +
                    "\n" + "A. Umanailo \n" +
                    "\n" + "R. Adi Utama \n" +
                    "\n" + "D. Abdulkak \n" +
                    "\n" + "Cassio \n" +
                    "\n" + "M. Riyandi","B. Hodak","D. Nurjaman"));

            teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/1/12/Logo_Persib.png","https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Logo-pss-vector.svg/1200px-Logo-pss-vector.svg.png","Persib Bandung","PSS","2","1","FT","Min, 15/3" ,"Geffey Castilion \n" +
                    "\n" + "Wander Luiz","Aaron Evans" ,"20'\n" +
                    "\n" + "36'" ,"2'","9 \n" +
                    "\n" + "20 \n" +
                    "\n" + "10 \n" +
                    "\n" + "23 \n" +
                    "\n" + "91 \n" +
                    "\n" + "13 \n" +
                    "\n" + "3 \n" +
                    "\n" + "32 \n" +
                    "\n" + "2 \n" +
                    "\n" + "22 \n" +
                    "\n" + "78" , "Wander \n" +
                    "\n" + "G. Castillion \n" +
                    "\n" + "E. Vizcarra \n" +
                    "\n" + "K. Kurniawan \n" +
                    "\n" + "O. Nazari\n" +
                    "\n" + "F. Haryadi \n" +
                    "\n" + "A. Idrus \n" +
                    "\n" + "V. Igbonefo \n" +
                    "\n" + "N. Kuipers \n" +
                    "\n" + "S. Nasir \n" +
                    "\n" + "M. Wirawan"
                    , "11 \n" +
                    "\n" + "10 \n" +
                    "\n" + "17 \n" +
                    "\n" + "6 \n" +
                    "\n" + "27 \n" +
                    "\n" + "88 \n" +
                    "\n" + "3 \n" +
                    "\n" + "5 \n" +
                    "\n" + "2 \n" +
                    "\n" + "8 \n" +
                    "\n" + "21" , "Z. Krangar \n" +
                    "\n" + "E. Bokhasvili \n" +
                    "\n" + "I. Bachdim \n" +
                    "\n" + "W. Sukarta \n" +
                    "\n" + "I. Milla \n" +
                    "\n" + "Guilherme Batata \n" +
                    "\n" + "B. Nirwanto \n" +
                    "\n" + "A. Ramadhan \n" +
                    "\n" + "A. Evans \n" +
                    "\n" + "A. Irawan \n" +
                    "\n" + "E. Pramana","R. Alberts","D. Antonic"));

            teams.add(new Hasil("https://upload.wikimedia.org/wikipedia/id/f/f8/Logo_Persebaya_Surabaya.png","https://i0.wp.com/suarapapua.com/wp-content/uploads/2019/07/persipura-jayapura-5ba4ae76e85d1.png?resize=304%2C235&ssl=1","Persebaya","Persipura","3","4","FT","Jum, 13/3","David Da Silva \n" +
                    "\n" + "Mahmoud Eid \n" +
                    "\n" + "Rendy Irawan ","Thiago Eduardo Amaral \n" +
                    "\n" + "Muhammad Tahir \n" +
                    "\n" + "Yohannes Pahabol","43'\n" +
                    "\n" + "74' \n"+
                    "\n" + "90+1'","20' , 34' \n" +
                    "\n" + "51'" ,"9 \n" +
                    "\n" + "7 \n" +
                    "\n" + "41 \n" +
                    "\n" + "10 \n" +
                    "\n" + "28 \n" +
                    "\n" + "17 \n" +
                    "\n" + "88 \n" +
                    "\n" + "23 \n" +
                    "\n" + "32 \n" +
                    "\n" + "33 \n" +
                    "\n" + "20" , "Mahmoud Eid \n" +
                    "\n" + "David Silva \n" +
                    "\n" + "I. Jaya \n" +
                    "\n" + "M. Konate \n" +
                    "\n" + "A. Williams\n" +
                    "\n" + "R. Kambuaya \n" +
                    "\n" + "M. Slamat \n" +
                    "\n" + "H. Pranata \n" +
                    "\n" + "R. Ridho \n" +
                    "\n" + "K. Araya \n" +
                    "\n" + "R. Mokodompit"
                    , "86 \n" +
                    "\n" + "46 \n" +
                    "\n" + "10 \n" +
                    "\n" + "33 \n" +
                    "\n" + "32 \n" +
                    "\n" + "34 \n" +
                    "\n" + "18 \n" +
                    "\n" + "3 \n" +
                    "\n" + "28 \n" +
                    "\n" + "21 \n" +
                    "\n" + "27" , "B. Solossa \n" +
                    "\n" + "T. Ferre \n" +
                    "\n" + "Thiago \n" +
                    "\n" + "G. Mandowen \n" +
                    "\n" + "M. Tahir \n" +
                    "\n" + "T. Matsunaga \n" +
                    "\n" + "D. Rumakiek \n" +
                    "\n" + "D.H. Monim \n" +
                    "\n" + "I. Wamiau \n" +
                    "\n" + "Y. Pae \n" +
                    "\n" + "D. Sulaiman","R. Alberts","D. Antonic"));

        HasilAdapter adapter=new HasilAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);

    }
}
