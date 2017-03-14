package com.example.leechaelin.age_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("온도변환기");
        setContentView(R.layout.activity_main2);
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);

        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp1 = e1.getText().toString();
                double res = Integer.parseInt(temp1)*1.8+32;

                Toast.makeText(getApplicationContext(),"화씨 온도는 "+res+"입니다 ",Toast.LENGTH_SHORT).show();

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tem2 = e2.getText().toString();
                double res2 = (Integer.parseInt(tem2)-32)/1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는 "+res2+"입니다. ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
