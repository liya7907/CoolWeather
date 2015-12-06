package com.biu.coolweather.model;

/**
 * Author:Created by liya.
 * Time: on 2015/12/6 16:43
 * Version: V1.0
 * Desc:CoolWeather Bean
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int ProvinceId;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }
}
