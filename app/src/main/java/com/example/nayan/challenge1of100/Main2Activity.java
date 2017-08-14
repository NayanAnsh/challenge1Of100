package com.example.nayan.challenge1of100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
           static int A2;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainActivity.A1 = (int) (Math.random() * 1000);
        text2 =  (TextView)findViewById(R.id.text2);
        text2.setText(" "+ A2);

    }

    public void next(View view) {
        Intent  i =  new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
