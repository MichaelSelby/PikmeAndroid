package com.pikmeghana.pikme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Michael on 11/30/16.
 */

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000; //that's 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent welcomeIntent = new Intent(Splash.this, MainActivity.class);
                startActivity(welcomeIntent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
