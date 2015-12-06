package com.biu.coolweather.model;

/**
 * Author:Created by liya7 .
 * Time: on 2015/12/6 16:45
 * Version:
 * Desc:CoolWeather Bean
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countryCode) {
        this.countyCode = countryCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
