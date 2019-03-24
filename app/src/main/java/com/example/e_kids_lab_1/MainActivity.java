package com.example.e_kids_lab_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    Switch  aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch2);


        // 2 button.setVisibility(View.INVISIBLE);
        // 1 text.setVisibility(View.INVISIBLE);
        // 2 aSwitch.setVisibility(View.VISIBLE);


//  1      button.setOnClickListener(new View.OnClickListener() {
//  1          public void onClick(View v) {
//  1              showText(v);
//  1          }
//  1      });


//  2      aSwitch.setOnClickListener(new View.OnClickListener() {
//  2          public void onClick(View v) {
//  2              if (button.getVisibility() == View.INVISIBLE) {
//  2                  button.setVisibility(View.VISIBLE);
//  2
//  2              } else {
//  2                  button.setVisibility(View.INVISIBLE);
//  2              }
//  2          }
//  2      });



    }

//  1  public void showText(View v) {
//  1      if (text.getVisibility() == View.INVISIBLE) {
//  1          text.setText("Hello, Vlad");
//  1          text.setVisibility(View.VISIBLE);
//  1
//  1      } else {
//  1          text.setVisibility(View.INVISIBLE);
//  1      }
//  1  }
}
