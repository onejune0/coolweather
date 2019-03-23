package com.onejune.coolweather;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.onejune.coolweather.util.SharedPreUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        boolean isFirst=SharedPreUtils.getBoolean(this,"isFirst",true);
        if(isFirst){
            SharedPreUtils.putBoolean(this,"isFirst",true);
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            this.finish();
        }
    }
}
