package com.example.android_project.Models;

public class Transfer {
    public String logo_pemain;
    public String logo;
    public String logo_team;

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

    public Transfer(String logo_pemain, String logo, String logo_team) {
        this.logo_pemain = logo_pemain;
        this.logo = logo;
        this.logo_team = logo_team;


    }
}
