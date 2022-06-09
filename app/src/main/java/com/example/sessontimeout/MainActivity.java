//
//  MainActivity.java
//  SessionTimeOut
//
//  Created by Saiful Islam on 09/06/22.
//  Copyright © 2021 Saiful Islam. All rights reserved.
//

package com.example.sessontimeout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home Screen" );
    }
}