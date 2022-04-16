package com.example.riyac.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView, textView2;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView2);
        sharedPreferences=getSharedPreferences("key" ,0);
        String str1=sharedPreferences.getString("name", "default_name");
        String str2=sharedPreferences.getString("id", "default_id");
        textView.setText(str1);
        textView2.setText(str2);
    }
}
