package com.wong.gps.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
//将本地任务同步到服务端Service

public class SystemRemoteService extends Service {
    public SystemRemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
