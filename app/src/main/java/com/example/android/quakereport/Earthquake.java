package com.example.android.quakereport;

public class Earthquake {
    private final Double magnitude;
    private final String city;
    private final Long date;
    private final String mUrl;

    public Earthquake(Double magnitude, String city, Long date, String mUrl) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
        this.mUrl = mUrl;
    }

    public String getmUrl() {
        return mUrl;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return city;
    }

    public Long getTimeInMilliseconds() {
        return date;
    }
}
