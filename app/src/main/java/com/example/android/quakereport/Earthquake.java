package com.example.android.quakereport;

public class Earthquake {
    private String magnitude;
    private String city;
    private String date;

    public Earthquake(String magnitude, String city, String date) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;

    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
