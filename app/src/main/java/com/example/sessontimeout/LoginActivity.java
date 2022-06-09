//
//  LoginActivity.java
//  SessionTimeOut
//
//  Created by Saiful Islam on 09/06/22.
//  Copyright © 2021 Saiful Islam. All rights reserved.
//

package com.example.sessontimeout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}
