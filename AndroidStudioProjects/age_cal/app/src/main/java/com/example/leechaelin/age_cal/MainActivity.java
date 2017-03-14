package com.example.leechaelin.age_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        e1 =(EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);

        b1 =(Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = e1.getText().toString();
                int result = 2017-Integer.parseInt(year)+1;
                Toast.makeText(getApplicationContext(),"당신의 나이는"+result+"입니다",Toast.LENGTH_SHORT)
                .show();
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int ans = 2017-Integer.parseInt(age)+1;
                Toast.makeText(getApplicationContext(),"당신이 테어난 해는 "+ans+"년입니다",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
