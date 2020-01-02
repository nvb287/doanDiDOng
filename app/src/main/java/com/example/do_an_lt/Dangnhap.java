package com.example.do_an_lt;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Dangnhap extends AppCompatActivity {
    Button choiluon, luatchoi,xephang,goicredit;
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_nhap);
        choiluon =(Button) findViewById(R.id.choi_button);
        luatchoi = (Button) findViewById(R.id.luatChoi_button);
        xephang = (Button) findViewById(R.id.lichSu_button) ;
        goicredit=(Button) findViewById(R.id.credit_button);


       // ControlButton();

        choiluon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangnhap.this,com.example.do_an_lt.Chude.class);
                startActivity(intent);
            }
        });
        luatchoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangnhap.this,com.example.do_an_lt.Luatchoi.class);
                startActivity(intent);
            }
        });
        xephang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangnhap.this,com.example.do_an_lt.Xephang.class);
                startActivity(intent);

            }
        });
        goicredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Dangnhap.this,com.example.do_an_lt.Goicredit.class);
                startActivity(intent);
            }
        });

    }


}
