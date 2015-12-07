package com.biu.coolweather.utils;

/**
 * Author:Created by liya7 .
 * Time: on 2015/12/6 18:05
 * Version: 1.0
 * Desc:CoolWeather HttpUtils中需要的接口
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
