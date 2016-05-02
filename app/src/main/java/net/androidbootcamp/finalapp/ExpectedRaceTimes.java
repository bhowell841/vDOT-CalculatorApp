package net.androidbootcamp.finalapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class ExpectedRaceTimes extends AppCompatActivity {
    int vDotEntered;
    String jSon ="{\"Levels\":" +
            "{\"30\":\n" +
            "{\"Level\":30,\"Times\":{\"5K\":\"30:40\",\"10K\":\"63:46\",\"1/2 Marathon\":\"2:21:04\",\"Marathon\":\"4:49:17\"},\n" +
            "\"31\": " +
            "{\"Level\":31,\"Times\":{\"5K\":\"29:51\",\"10K\":\"62:03\",\"1/2 Marathon\":\"2:17:21\",\"Marathon\":\"4:41:57\"}\n" +
            "} }}}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expected_race_times);
        JSONObject reader;
        reader = null;
        try {
            reader = new JSONObject(jSon);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        final JSONObject data = reader;
        final EditText vDot = (EditText)findViewById(R.id.txtVdot);
        Button calculateVdot = (Button)findViewById(R.id.btnCalculate);
        final TextView fiveK = (TextView) findViewById(R.id.txt5k);
        final TextView tenK = (TextView) findViewById(R.id.txt10k);
        final TextView halfM = (TextView) findViewById(R.id.txtHalf);
        final TextView fullM = (TextView) findViewById(R.id.txtFull);
        assert calculateVdot != null;
        calculateVdot.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                try {
                    JSONObject level = data.getJSONObject(vDot.getText().toString());
                    //level.getinteger
                    //toast
                    fiveK.setText(level.getJSONObject("Times").getString("5K"));
                    tenK.setText(level.getJSONObject("Times").getString("10K"));
                    halfM.setText(level.getJSONObject("Times").getString("1/2 Marathon"));
                    fullM.setText(level.getJSONObject("Times").getString("Marathon"));
                }
                catch(JSONException e){

                };

            }
        });
    }

}//end class
