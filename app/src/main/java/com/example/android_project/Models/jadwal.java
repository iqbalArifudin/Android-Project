package com.example.android_project.Models;

public class jadwal {
    public String logo_club1;
    public String logo_club2;
    public String logotv;
    public String waktu;
    public String tanggal;
    public String club1;
    public String club2;

    public jadwal(String logo_club1, String logo_club2, String logotv, String waktu, String tanggal, String club1, String club2) {
        this.logo_club1 = logo_club1;
        this.logo_club2 = logo_club2;
        this.logotv = logotv;
        this.waktu = waktu;
        this.tanggal = tanggal;
        this.club1 = club1;
        this.club2 = club2;
    }

    public String getLogo_club1() {
        return logo_club1;
    }

    public void setLogo_club1(String logo_club1) {
        this.logo_club1 = logo_club1;
    }

    public String getLogo_club2() {
        return logo_club2;
    }

    public void setLogo_club2(String logo_club2) {
        this.logo_club2 = logo_club2;
    }

    public String getLogotv() {
        return logotv;
    }

    public void setLogotv(String logotv) {
        this.logotv = logotv;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getClub1() {
        return club1;
    }

    public void setClub1(String club1) {
        this.club1 = club1;
    }

    public String getClub2() {
        return club2;
    }

    public void setClub2(String club2) {
        this.club2 = club2;
    }
}
