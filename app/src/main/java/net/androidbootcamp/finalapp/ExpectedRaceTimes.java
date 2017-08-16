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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class ExpectedRaceTimes extends AppCompatActivity {
    int vDotEntered;
    String jSon ="{\"Levels\":" +
            "{\"30\":\n" +
            "{\"Level\":30,\"Times\":{\"5K\":\"30:40\",\"10K\":\"63:46\",\"1/2 Marathon\":\"2:21:04\",\"Marathon\":\"4:49:17\"},\n" +
            "\"31\": " +
            "{\"Level\":31,\"Times\":{\"5K\":\"29:51\",\"10K\":\"62:03\",\"1/2 Marathon\":\"2:17:21\",\"Marathon\":\"4:41:57\"}\n" +
            "\"32\": " +
            "{\"Level\":32,\"Times\":{\"5K\":\"29:05\",\"10K\":\"60:26\",\"1/2 Marathon\":\"2:13:49\",\"Marathon\":\"4:34:59\"}\n" +
            "\"33\": " +
            "{\"Level\":33,\"Times\":{\"5K\":\"28:21\",\"10K\":\"58:54\",\"1/2 Marathon\":\"2:10:27\",\"Marathon\":\"4:28:22\"}\n" +
            "\"34\": " +
            "{\"Level\":34,\"Times\":{\"5K\":\"27:39\",\"10K\":\"57:26\",\"1/2 Marathon\":\"2:07:16\",\"Marathon\":\"4:22:03\"}\n" +
            "\"35\": " +
            "{\"Level\":35,\"Times\":{\"5K\":\"27:00\",\"10K\":\"56:03\",\"1/2 Marathon\":\"2:04:13\",\"Marathon\":\"4:16:03\"}\n" +
            "\"36\": " +
            "{\"Level\":36,\"Times\":{\"5K\":\"26:221\",\"10K\":\"54:44\",\"1/2 Marathon\":\"2:01:19\",\"Marathon\":\"4:10:19\"}\n" +
            "\"37\": " +
            "{\"Level\":37,\"Times\":{\"5K\":\"25:46\",\"10K\":\"53:29\",\"1/2 Marathon\":\"1:58:34\",\"Marathon\":\"4:04:50\"}\n" +
            "\"38\": " +
            "{\"Level\":38,\"Times\":{\"5K\":\"25:12\",\"10K\":\"52:17\",\"1/2 Marathon\":\"1:55:55\",\"Marathon\":\"3:59:35\"}\n" +
            "\"39\": " +
            "{\"Level\":39,\"Times\":{\"5K\":\"24:39\",\"10K\":\"51:09\",\"1/2 Marathon\":\"1:53:24\",\"Marathon\":\"3:54:34\"}\n" +
            "\"40\": " +
            "{\"Level\":40,\"Times\":{\"5K\":\"24:08\",\"10K\":\"50:03\",\"1/2 Marathon\":\"1:50:59\",\"Marathon\":\"3:49:45\"}\n" +
            "\"41\": " +
            "{\"Level\":41,\"Times\":{\"5K\":\"23:38\",\"10K\":\"49:01\",\"1/2 Marathon\":\"1:48:40\",\"Marathon\":\"3:45:09\"}\n" +
            "\"42\": " +
            "{\"Level\":42,\"Times\":{\"5K\":\"23:09\",\"10K\":\"48:01\",\"1/2 Marathon\":\"1:46:27\",\"Marathon\":\"3:40:43\"}\n" +
            "\"43\": " +
            "{\"Level\":43,\"Times\":{\"5K\":\"22:41\",\"10K\":\"47:04\",\"1/2 Marathon\":\"1:44:20\",\"Marathon\":\"3:36:28\"}\n" +
            "\"44\": " +
            "{\"Level\":44,\"Times\":{\"5K\":\"22:15\",\"10K\":\"46:09\",\"1/2 Marathon\":\"1:42:17\",\"Marathon\":\"3:32:23\"}\n" +
            "\"45\": " +
            "{\"Level\":45,\"Times\":{\"5K\":\"21:50\",\"10K\":\"45:16\",\"1/2 Marathon\":\"1:40:20\",\"Marathon\":\"3:28:26\"}\n" +
            "\"46\": " +
            "{\"Level\":46,\"Times\":{\"5K\":\"21:25\",\"10K\":\"44:25\",\"1/2 Marathon\":\"1:38:27\",\"Marathon\":\"3:24:39\"}\n" +
            "\"47\": " +
            "{\"Level\":47,\"Times\":{\"5K\":\"21:02\",\"10K\":\"43:36\",\"1/2 Marathon\":\"1:36:38\",\"Marathon\":\"3:21:00\"}\n" +
            "\"48\": " +
            "{\"Level\":48,\"Times\":{\"5K\":\"20:39\",\"10K\":\"42:50\",\"1/2 Marathon\":\"1:34:53\",\"Marathon\":\"3:17:29\"}\n" +
            "\"49\": " +
            "{\"Level\":49,\"Times\":{\"5K\":\"20:18\",\"10K\":\"42:04\",\"1/2 Marathon\":\"1:33:12\",\"Marathon\":\"3:14:06\"}\n" +
            "\"50\": " +
            "{\"Level\":50,\"Times\":{\"5K\":\"19:57\",\"10K\":\"41:21\",\"1/2 Marathon\":\"1:31:35\",\"Marathon\":\"3:10:49\"}\n" +
            "\"51\": " +
            "{\"Level\":51,\"Times\":{\"5K\":\"19:36\",\"10K\":\"40:39\",\"1/2 Marathon\":\"1:30:02\",\"Marathon\":\"3:07:39\"}\n" +
            "\"52\": " +
            "{\"Level\":52,\"Times\":{\"5K\":\"19:17\",\"10K\":\"39:59\",\"1/2 Marathon\":\"1:28:31\",\"Marathon\":\"3:04:36\"}\n" +
            "\"53\": " +
            "{\"Level\":53,\"Times\":{\"5K\":\"18:58\",\"10K\":\"39:20\",\"1/2 Marathon\":\"1:27:04\",\"Marathon\":\"3:01:39\"}\n" +
            "\"54\": " +
            "{\"Level\":54,\"Times\":{\"5K\":\"18:40\",\"10K\":\"38:42\",\"1/2 Marathon\":\"1:25:40\",\"Marathon\":\"2:58:47\"}\n" +
            "\"55\": " +
            "{\"Level\":55,\"Times\":{\"5K\":\"18:22\",\"10K\":\"38:06\",\"1/2 Marathon\":\"1:24:18\",\"Marathon\":\"2:56:01\"}\n" +
            "\"56\": " +
            "{\"Level\":56,\"Times\":{\"5K\":\"18:05\",\"10K\":\"37:31\",\"1/2 Marathon\":\"1:23:00\",\"Marathon\":\"2:53:20\"}\n" +
            "\"57\": " +
            "{\"Level\":57,\"Times\":{\"5K\":\"17:49\",\"10K\":\"36:57\",\"1/2 Marathon\":\"1:21:43\",\"Marathon\":\"2:50:45\"}\n" +
            "\"58\": " +
            "{\"Level\":58,\"Times\":{\"5K\":\"17:33\",\"10K\":\"36:24\",\"1/2 Marathon\":\"1:20:30\",\"Marathon\":\"2:48:14\"}\n" +
            "\"59\": " +
            "{\"Level\":59,\"Times\":{\"5K\":\"17:17\",\"10K\":\"35:52\",\"1/2 Marathon\":\"1:19:18\",\"Marathon\":\"2:45:47\"}\n" +
            "\"60\": " +
            "{\"Level\":60,\"Times\":{\"5K\":\"17:03\",\"10K\":\"35:22\",\"1/2 Marathon\":\"1:18:09\",\"Marathon\":\"2:43:25\"}\n" +
            "\"61\": " +
            "{\"Level\":61,\"Times\":{\"5K\":\"16:48\",\"10K\":\"34:52\",\"1/2 Marathon\":\"1:17:02\",\"Marathon\":\"2:41:08\"}\n" +
            "\"62\": " +
            "{\"Level\":62,\"Times\":{\"5K\":\"16:34\",\"10K\":\"34:23\",\"1/2 Marathon\":\"1:15:57\",\"Marathon\":\"2:38:54\"}\n" +
            "\"63\": " +
            "{\"Level\":63,\"Times\":{\"5K\":\"16:20\",\"10K\":\"33:55\",\"1/2 Marathon\":\"1:14:54\",\"Marathon\":\"2:36:44\"}\n" +
            "\"64\": " +
            "{\"Level\":64,\"Times\":{\"5K\":\"16:07\",\"10K\":\"33:28\",\"1/2 Marathon\":\"1:13:53\",\"Marathon\":\"2:34:38\"}\n" +
            "\"65\": " +
            "{\"Level\":65,\"Times\":{\"5K\":\"15:54\",\"10K\":\"33:01\",\"1/2 Marathon\":\"1:12:53\",\"Marathon\":\"2:32:35\"}\n" +
            "\"66\": " +
            "{\"Level\":66,\"Times\":{\"5K\":\"15:42\",\"10K\":\"32:35\",\"1/2 Marathon\":\"1:11:56\",\"Marathon\":\"2:30:36\"}\n" +
            "\"67\": " +
            "{\"Level\":67,\"Times\":{\"5K\":\"15:29\",\"10K\":\"32:11\",\"1/2 Marathon\":\"1:11:00\",\"Marathon\":\"2:28:40\"}\n" +
            "\"68\": " +
            "{\"Level\":68,\"Times\":{\"5K\":\"15:18\",\"10K\":\"31:46\",\"1/2 Marathon\":\"1:10:05\",\"Marathon\":\"2:26:47\"}\n" +
            "\"69\": " +
            "{\"Level\":69,\"Times\":{\"5K\":\"15:06\",\"10K\":\"31:23\",\"1/2 Marathon\":\"1:09:12\",\"Marathon\":\"2:24:57\"}\n" +
            "\"70\": " +
            "{\"Level\":70,\"Times\":{\"5K\":\"14:55\",\"10K\":\"31:00\",\"1/2 Marathon\":\"1:08:21\",\"Marathon\":\"2:23:10\"}\n" +
            "\"71\": " +
            "{\"Level\":71,\"Times\":{\"5K\":\"14:44\",\"10K\":\"30:38\",\"1/2 Marathon\":\"1:07:31\",\"Marathon\":\"2:21:26\"}\n" +
            "\"72\": " +
            "{\"Level\":72,\"Times\":{\"5K\":\"14:33\",\"10K\":\"30:16\",\"1/2 Marathon\":\"1:06:42\",\"Marathon\":\"2:19:44\"}\n" +
            "\"73\": " +
            "{\"Level\":73,\"Times\":{\"5K\":\"14:23\",\"10K\":\"29:55\",\"1/2 Marathon\":\"1:05:54\",\"Marathon\":\"2:18:05\"}\n" +
            "\"74\": " +
            "{\"Level\":74,\"Times\":{\"5K\":\"14:13\",\"10K\":\"29:34\",\"1/2 Marathon\":\"1:05:08\",\"Marathon\":\"2:16:29\"}\n" +
            "\"75\": " +
            "{\"Level\":75,\"Times\":{\"5K\":\"14:03\",\"10K\":\"29:14\",\"1/2 Marathon\":\"1:04:23\",\"Marathon\":\"2:14:55\"}\n" +
            "\"76\": " +
            "{\"Level\":76,\"Times\":{\"5K\":\"13:54\",\"10K\":\"28:55\",\"1/2 Marathon\":\"1:03:39\",\"Marathon\":\"2:13:23\"}\n" +
            "\"77\": " +
            "{\"Level\":77,\"Times\":{\"5K\":\"13:44\",\"10K\":\"28:36\",\"1/2 Marathon\":\"1:02:56\",\"Marathon\":\"2:11:54\"}\n" +
            "\"78\": " +
            "{\"Level\":78,\"Times\":{\"5K\":\"13:35\",\"10K\":\"28:17\",\"1/2 Marathon\":\"1:02:15\",\"Marathon\":\"2:10:27\"}\n" +
            "\"79\": " +
            "{\"Level\":79,\"Times\":{\"5K\":\"13:26\",\"10K\":\"27:59\",\"1/2 Marathon\":\"1:01:34\",\"Marathon\":\"2:09:02\"}\n" +
            "\"80\": " +
            "{\"Level\":80,\"Times\":{\"5K\":\"13:17\",\"10K\":\"27:41\",\"1/2 Marathon\":\"1:00:54\",\"Marathon\":\"2:07:38\"}\n" +
            "\"81\": " +
            "{\"Level\":81,\"Times\":{\"5K\":\"13:09\",\"10K\":\"27:24\",\"1/2 Marathon\":\"1:00:15\",\"Marathon\":\"2:06:17\"}\n" +
            "\"82\": " +
            "{\"Level\":82,\"Times\":{\"5K\":\"13:01\",\"10K\":\"27:07\",\"1/2 Marathon\":\"0:59:38\",\"Marathon\":\"2:04:57\"}\n" +
            "\"83\": " +
            "{\"Level\":83,\"Times\":{\"5K\":\"12:53\",\"10K\":\"26:51\",\"1/2 Marathon\":\"0:59:01\",\"Marathon\":\"2:03:40\"}\n" +
            "\"84\": " +
            "{\"Level\":84,\"Times\":{\"5K\":\"12:45\",\"10K\":\"26:34\",\"1/2 Marathon\":\"0:58:25\",\"Marathon\":\"2:02:24\"}\n" +
            "\"85\": " +
            "{\"Level\":85,\"Times\":{\"5K\":\"12:37\",\"10K\":\"26:19\",\"1/2 Marathon\":\"0:57:50\",\"Marathon\":\"2:01:10\"}\n" +
            "} }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}";


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
                String vdotString = vDot.getText().toString();
                try {
                    int vDot = Integer.parseInt(vdotString);
                    if (vDot<30 || vDot>85){
                        Toast.makeText(ExpectedRaceTimes.this,"Invalid VDOT.  VDot must be between 30 and 85.", Toast.LENGTH_LONG).show();
                    }
                }
                catch (NumberFormatException e){
                    Toast.makeText(ExpectedRaceTimes.this,"Invalid VDOT.  VDot must be a number.", Toast.LENGTH_LONG).show();
                }


                try {
                    JSONObject level = data.getJSONObject(vDot.getText().toString());
                    //if(vdot < 30 || vdot > 85){

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
