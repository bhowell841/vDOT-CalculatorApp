package net.androidbootcamp.finalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer chariots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread() {

            @Override
            public void run() {
                try {
                    chariots = MediaPlayer.create(SplashActivity.this, R.raw.chariotsoffire);
                    chariots.start();
                    sleep(7000);
                }

                catch (InterruptedException e){

                }

                finally{
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        timer.start();
    }
    @Override protected void onPause() {
        super.onPause();
        chariots.release();
    }
}//end class