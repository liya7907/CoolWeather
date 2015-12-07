package com.biu.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.biu.coolweather.service.AutoUpdateService;

/**
 * Author:Created by liya7 .
 * Time: on 2015/12/7 19:50
 * Version:
 * Desc:CoolWeather 配合后台更新天气
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
