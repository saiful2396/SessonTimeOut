//
//  MyApp.java
//  SessionTimeOut
//
//  Created by Saiful Islam on 09/06/22.
//  Copyright © 2021 Saiful Islam. All rights reserved.
//

package com.example.sessontimeout;

import android.app.Application;

import java.util.Timer;
import java.util.TimerTask;

public class MyApp extends Application {
    private LogoutListener listener;
    private Timer timer;

    public void startUserSession() {
        cancelTimer();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                listener.onSessionLogout();
            }
        }, 6000); //6000=6sec [6s * 1000 = 6000 milliseconds]
    }

    private void cancelTimer() {
        if(timer != null)
        {
            timer.cancel();
        }
    }

    public void registerSessionListener(LogoutListener listener) {
        this.listener = listener;
    }

    public void onUserInteraction() {
        startUserSession();
    }
}
