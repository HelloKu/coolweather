package com.coolweather.android.db;

public class County {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }
}
