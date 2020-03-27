package com.example.android_project.Models;

public class Hasil {
    public String logo_club1;
    public String logo_club2;
    public String club1;
    public String club2;
    public String score1;
    public String score2;
    public String fulltime;
    public String tanggal;

    public Hasil(String logo_club1, String logo_club2, String club1, String club2, String score1, String score2, String fulltime, String tanggal) {
        this.logo_club1 = logo_club1;
        this.logo_club2 = logo_club2;
        this.club1 = club1;
        this.club2 = club2;
        this.score1 = score1;
        this.score2 = score2;
        this.fulltime = fulltime;
        this.tanggal = tanggal;
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

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    public String getFulltime() {
        return fulltime;
    }

    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
