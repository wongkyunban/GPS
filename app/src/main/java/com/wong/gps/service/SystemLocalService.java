package com.wong.gps.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

//本地GPS数据采集Service


public class SystemLocalService extends Service {

    public SystemLocalService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
