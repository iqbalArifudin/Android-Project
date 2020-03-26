package com.example.android_project.Models;

public class Topscore {
    public String logo;
    public String nama;
    public String club;
    public String goal;

    public Topscore(String logo, String nama, String club, String goal) {
        this.logo = logo;
        this.nama = nama;
        this.club = club;
        this.goal = goal;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
