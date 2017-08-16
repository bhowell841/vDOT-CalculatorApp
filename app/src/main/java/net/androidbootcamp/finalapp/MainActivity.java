package net.androidbootcamp.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.btnVdot);
        button2 = (Button)findViewById(R.id.btnExplain);
        button3 = (Button)findViewById(R.id.btnGo);

    }//end OnCreate

    Button.OnClickListener bVdot = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://sdtrackmag.com/DanielsOneSheet.pdf")));
        }
    };// end bVdot listener

    Button.OnClickListener bExplain = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://endurancebuzz.com/2008/07/23/defining-training-pace-using-vdot/")));

        }
    };// end bexplain listener

    Button.OnClickListener bCalculate = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            startActivity(new Intent(MainActivity.this, ExpectedRaceTimes.class));
        }
    };// end bCalculate listener

}//end class
