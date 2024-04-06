package com.peart.digital_tasbi_lte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    //TextView txtMarquee;
    Button add1,sub1,reset;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        add1=findViewById(R.id.add1);
        sub1=findViewById(R.id.sub1);
        reset=findViewById(R.id.reset);

      /*  txtMarquee = (TextView) findViewById(R.id.marqueeText);
        // Now we will call setSelected() method
        // and pass boolean value as true
        txtMarquee.setMarqueeRepeatLimit(200000);
        txtMarquee.setSelected(true);
        */



        //add
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count+=1;
                text.setText(""+count);
            }
        });

//subtruction
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count-=1;
                text.setText(""+count);
            }
        });

        //reset
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                text.setText(""+count);
            }
        });
    }
}