package com.example.leechaelin.age_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    CheckBox ck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText5);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.editText7);

        ck = (CheckBox)findViewById(R.id.checkBox);
        b1 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();

                if(s1==null){
                    s1 = "0";
                }
                if(s2 == null){
                    s2 = "0";
                }
                if(s3== null){
                    s3 = "0";
                }
                double res = Integer.parseInt(s1)*15000+Integer.parseInt(s2)*13000+Integer.parseInt(s3)*900;
                int sum =Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3);
                if(ck.isChecked()== true){
                    res = res*0.9;
                }


            }

        });

    }
}
