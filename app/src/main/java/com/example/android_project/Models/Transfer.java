package com.example.android_project.Models;

public class Transfer {
    public String logo_pemain;
    public String logo;
    public String logo_team;
    public String nama;
    public String club;
    public String harga;
    public String status;
    public String posisi;

    public String getLogo_pemain() {
        return logo_pemain;
    }

    public void setLogo_pemain(String logo_pemain) {
        this.logo_pemain = logo_pemain;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo_team() {
        return logo_team;
    }

    public void setLogo_team(String logo_team) {
        this.logo_team = logo_team;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }


    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }


    public Transfer(String logo_pemain, String logo, String logo_team, String nama, String club, String harga, String status, String posisi) {
        this.logo_pemain = logo_pemain;
        this.logo = logo;
        this.logo_team = logo_team;
        this.nama = nama;
        this.club = club;
        this.harga = harga;
        this.status = status;
        this.posisi = posisi;
    }
}
