package com.biu.coolweather.utils;

import android.text.TextUtils;

import com.biu.coolweather.db.CoolWeatherDB;
import com.biu.coolweather.model.City;
import com.biu.coolweather.model.County;
import com.biu.coolweather.model.Province;

/**
 * Author:Created by liya.
 * Time: on 2015/12/6 18:39
 * Version:
 * Desc:CoolWeather
 * 因为服务器返回的数据都是“代号|城市,代号|城市”，需要一个工具类来做解析
 */
public class Utility {
    /**
     * 处理省级数据
     *
     * @param coolWeatherDB
     * @param response
     * @return
     */
    public synchronized static boolean handleProvinceResponse(CoolWeatherDB coolWeatherDB, String response) {
        if (!TextUtils.isEmpty(response)) {
            String[] allProvinces = response.split(",");
            if (allProvinces != null && allProvinces.length > 0) {
                for (String p : allProvinces) {
                    Province province = new Province();
                    String[] array = p.split("\\|");
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    //保存数据到数据库
                    coolWeatherDB.saveProvince(province);
                }
                return true;
            }

        }
        return false;
    }

    /**
     * 处理市级数据
     * @param coolWeatherDB
     * @param response
     * @param provinceId
     * @return
     */
    public static boolean handleCityResponse(CoolWeatherDB coolWeatherDB, String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            String[] allCities = response.split(",");
            if (allCities != null && allCities.length > 0) {
                for (String c : allCities) {
                    City city = new City();
                    String[] array = c.split("\\|");
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(provinceId);
                    coolWeatherDB.saveCity(city);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 处理县级数据
     * @param coolWeatherDB
     * @param response
     * @param cityId
     * @return
     */
    public static boolean handleCountyResponse(CoolWeatherDB coolWeatherDB, String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            String[] allCounties = response.split(",");
            if (allCounties != null && allCounties.length > 0) {
                for (String c : allCounties) {
                    County county = new County();
                    String[] array = c.split("\\|");
                    county.setCountyCode(array[0]);
                    county.setCountyName(array[1]);
                    county.setCityId(cityId);
                    coolWeatherDB.saveCounty(county);
                }
                return true;
            }
        }
        return false;
    }

}
