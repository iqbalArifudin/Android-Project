package com.example.android_project.Models;

public class Kategori {
    public String logo;
    public String name;
    public String detail;

    public Kategori(String logo, String name, String detail) {
        this.logo = logo;
        this.name = name;
        this.detail=detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
