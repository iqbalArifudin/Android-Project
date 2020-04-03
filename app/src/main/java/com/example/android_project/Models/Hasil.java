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
    public String gol1;
    public String gol2;
    public String menit1;
    public String menit2;
    public String punggung1;
    public String pemain1;
    public String punggung2;
    public String pemain2;
    public String manajer;
    public String manajer2;

    public Hasil(String logo_club1, String logo_club2, String club1, String club2, String score1, String score2, String fulltime, String tanggal, String gol1, String gol2, String menit1,String menit2,String punggung1, String pemain1, String punggung2, String pemain2, String manajer, String manajer2) {
        this.logo_club1 = logo_club1;
        this.logo_club2 = logo_club2;
        this.club1 = club1;
        this.club2 = club2;
        this.score1 = score1;
        this.score2 = score2;
        this.fulltime = fulltime;
        this.tanggal = tanggal;
        this.gol1 = gol1;
        this.gol2 = gol2;
        this.punggung1 = punggung1;
        this.pemain1 = pemain1;
        this.punggung2 = punggung2;
        this.pemain2 = pemain2;
        this.manajer=manajer;
        this.manajer2=manajer2;
        this.menit1=menit1;
        this.menit2=menit2;

    }

    public String getMenit1() {
        return menit1;
    }

    public void setMenit1(String menit1) {
        this.menit1 = menit1;
    }

    public String getMenit2() {
        return menit2;
    }

    public void setMenit2(String menit2) {
        this.menit2 = menit2;
    }

    public String getManajer2() {
        return manajer2;
    }

    public void setManajer2(String manajer2) {
        this.manajer2 = manajer2;
    }

    public String getManajer() {
        return manajer;
    }

    public void setManajer(String manajer) {
        this.manajer = manajer;
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

    public String getGol1() {
        return gol1;
    }

    public void setGol1(String gol1) {
        this.gol1 = gol1;
    }

    public String getGol2() {
        return gol2;
    }

    public void setGol2(String gol2) {
        this.gol2 = gol2;
    }

    public String getPunggung1() {
        return punggung1;
    }

    public void setPunggung1(String punggung1) {
        this.punggung1 = punggung1;
    }

    public String getPemain1() {
        return pemain1;
    }

    public void setPemain1(String pemain1) {
        this.pemain1 = pemain1;
    }

    public String getPunggung2() {
        return punggung2;
    }

    public void setPunggung2(String punggung2) {
        this.punggung2 = punggung2;
    }

    public String getPemain2() {
        return pemain2;
    }

    public void setPemain2(String pemain2) {
        this.pemain2 = pemain2;
    }
}
