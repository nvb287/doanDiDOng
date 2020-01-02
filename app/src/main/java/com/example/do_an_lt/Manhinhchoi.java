package com.example.do_an_lt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Manhinhchoi extends AppCompatActivity {
    Button tuvantaicho,hoiykienkhangia,goidienthoai,nammuoi,A,B,C,D;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.man_hinh_choi);

        tuvantaicho=(Button)findViewById(R.id.tuVanTaiCho_button);
        hoiykienkhangia=(Button)findViewById(R.id.hoiykienkhangia_button);
        goidienthoai=(Button)findViewById(R.id.goidienchonguoithan_button);
        nammuoi=(Button)findViewById(R.id.nammuoinammuoi_button);

        A = (Button) findViewById(R.id.a_button);

        B = (Button) findViewById(R.id.b_button);

        C = (Button) findViewById(R.id.c_button);

        D = (Button) findViewById(R.id.d_button);


        tuvantaicho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinhchoi.this,com.example.do_an_lt.Tuvantaicho.class);
                startActivity(intent);

            }
        });
        nammuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B.setEnabled(false);
                A.setEnabled(true);
                C.setEnabled(true);
                D.setEnabled(false);
            }
        });






    }


}
