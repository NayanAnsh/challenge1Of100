package com.example.nayan.challenge1of100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  static int A1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Main2Activity.A2 = (int) (Math.random()*100);
        TextView t2 =  (TextView)findViewById(R.id.text1);
        t2.setText(" "+A1);

    }

    public void next(View view) {
        Intent i  =  new Intent(this,Main2Activity.class);
        startActivity(i);
    }

}
