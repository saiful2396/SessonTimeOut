//
//  BaseActivity.java
//  SessionTimeOut
//
//  Created by Saiful Islam on 09/06/22.
//  Copyright © 2021 Saiful Islam. All rights reserved.
//

package com.example.sessontimeout;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements LogoutListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MyApp) getApplication()).registerSessionListener(this);
        ((MyApp) getApplication()).startUserSession();
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        ((MyApp) getApplication()).onUserInteraction();
    }

    @Override
    public void onSessionLogout() {
        finish();

        startActivity(new Intent(this, LoginActivity.class));
    }
}
