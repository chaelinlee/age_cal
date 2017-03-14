package com.example.leechaelin.age_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4;
    String s1,s2;
    int ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("계산기 ");
        setContentView(R.layout.activity_main4);
        init();

    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText8);
        e2 = (EditText)findViewById(R.id.editText9);
        b1 = (Button)findViewById(R.id.button10);
        b2 = (Button)findViewById(R.id.button11);
        b3 = (Button)findViewById(R.id.button12);
        b4 = (Button)findViewById(R.id.button13);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(s2.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    ans = Integer.parseInt(s1) + Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(), "더한 값은 " + ans + "입니다 ", Toast.LENGTH_SHORT).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();

                if(s1.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(s2.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    ans = Integer.parseInt(s1) - Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(),"뺸 값은 "+ans+"입니다 ",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(s2.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    ans = Integer.parseInt(s1) * Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(),"곱한 값은 "+ans+"입니다 ",Toast.LENGTH_SHORT).show();
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(s2.equals("")){
                    Toast.makeText(getApplicationContext(),"입력하세요 ",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    try{
                        Double ans2 = Double.parseDouble(s1)/Double.parseDouble(s2);
                        Toast.makeText(getApplicationContext(),"나눈값은 "+ans2+"입니다.",Toast.LENGTH_SHORT).show();
                    }catch(ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"나눈 값은 0 입니다 ",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}
