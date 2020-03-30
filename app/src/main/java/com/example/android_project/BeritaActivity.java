package com.example.android_project;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_project.Adapter.BeritaAdapter;
import com.example.android_project.Models.Kategori;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BeritaActivity extends AppCompatActivity {
    public static final String EXTRA_BERITA="extra_berita ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Kategori> teams = new ArrayList<>();
        teams.add(new Kategori("https://cdn0-production-images-kly.akamaized.net/P5mLdsFYGNKuT0dgwgNr2OOZA7o=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3047644/original/093517600_1581431309-IMG_20200211_211838.jpg", "Kompetisi Dihentikan, Agenda Barito Putera Berantakan", "Hiruk pikuk dunia sepak bola di Indonesia sedang berhenti. Pandemi virus Corona dan penyakit COVID-19 menjadi penyebab 'tak terduga' yang membuat seluruh kasta liga di Tanah Air menghentikan perjalanan sejenak.\n" +
                "\n" +
                "Namun, bukan berarti tak ada yang menarik dengan sajian sepak bola di Nusantara. Selalu ada yang spesial, termasuk di Bola.com. Yup, di tengah tak ada pertandingan, Sahabat Bola.com bisa mengikuti kuis istimewa tentang dunia 'bal-balan' lokal."));
//        teams.add(new Kategori("https://cdn0-production-images-kly.akamaized.net/Q4VWzcweOj4FrI4OoE-dV_QrpOI=/0x0:0x0/1280x720/filters:quality(75):strip_icc():format(jpeg):watermark(kly-media-production/assets/images/watermarks/bola/watermark-color-landscape-new.png,1205,20,0)/kly-media-production/medias/3082922/original/061912200_1584884125-20200306IQ_Persita_Tangerang_Vs_PSM_Makassar_30.JPG", "Kelanjutan Kompetisi Tak Pasti, Persita Buka Opsi Potong Gaji Pemain"));
//        teams.add(new Kategori("https://cdn1-production-images-kly.akamaized.net/c40QIqXMQEVmjzSEFKNg3w60GZ0=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2874750/original/058508600_1565103447-_R__0232.JPG", "Andritany Ardhiyasa: Keputusan Penghentian Kompetisi Sudah Tepat"));
//        teams.add(new Kategori("https://cdn1-production-images-kly.akamaized.net/5W6T5DTjF57OX9mv54ghdolBEOg=/0x0:0x0/1280x720/filters:quality(75):strip_icc():format(jpeg):watermark(kly-media-production/assets/images/watermarks/bola/watermark-color-landscape-new.png,1205,20,0)/kly-media-production/medias/3066498/original/005841600_1583216375-20200302IQ_Tira_Persikabo_Vs_Arema_FC_11.jpg", "Rahasia Arema FC Menjaga Tradisi Mencetak Pemain Berkarakter Ngotot"));
//        teams.add(new Kategori("https://cdn0-production-images-kly.akamaized.net/CdExQH_5KPVq3k-h6FlEkWexPhw=/108x159:962x640/1280x720/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1828253/original/063651600_1515670510-logo_psms.jpg", "PSMS Medan Perkenalkan 26 Skuat untuk Mengarungi Liga 2 2020"));
//        teams.add(new Kategori("https://cdn1-production-images-kly.akamaized.net/rt91aNlmf9EtMO0renIjBEZMSEE=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3078034/original/094204900_1584361584-3_Klub_Promosi.jpg", "Sorotan: Performa 3 Tim Promosi Shopee Liga 1 2020, Siapa Terburuk?"));
//        teams.add(new Kategori("https://cdn1-production-images-kly.akamaized.net/ZsieaAUhVzIyetEEwp0n7dZg5Yg=/0x0:3000x1687/1280x720/filters:quality(75):strip_icc():format(jpeg):watermark(kly-media-production/assets/images/watermarks/bola/watermark-color-landscape-new.png,1205,20,0)/kly-media-production/medias/3064196/original/047629700_1583000793-_MG_1204.JPG", "Menyorot 5 Tim Jatim yang Kehilangan Poin di Kandang, Alarm bagi Persik dan Persebaya"));
//        teams.add(new Kategori("https://cdn0-production-images-kly.akamaized.net/I7aNtq-4kIO2LLVvvWVf8gMhOg0=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3051236/original/084271000_1581757548-IMG_20200215_150708.jpg", "Nasib Apes 3 Pemain Asing di Shopee Liga 1 2020"));

        BeritaAdapter adapter=new BeritaAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
