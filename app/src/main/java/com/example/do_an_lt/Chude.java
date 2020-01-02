package com.example.do_an_lt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Chude extends AppCompatActivity {
    Button khoahoc ,lichsu , thethao,vanhoa;
    @Override
protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.chon_chu_de);

        //Anh xa

        khoahoc = (Button) findViewById(R.id.khoaHoc_button);
        vanhoa=(Button)findViewById(R.id.vanHoa_button);
        lichsu=(Button)findViewById(R.id.lichSu_button);
        thethao=(Button)findViewById(R.id.theThao_button);

        khoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chude.this,com.example.do_an_lt.Manhinhchoi.class);
                startActivity(intent);
            }
        });

        vanhoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chude.this,com.example.do_an_lt.Manhinhchoi.class);
                startActivity(intent);
            }
        });

        lichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chude.this,com.example.do_an_lt.Manhinhchoi.class);
                startActivity(intent);
            }
        });

        thethao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chude.this,com.example.do_an_lt.Manhinhchoi.class);
                startActivity(intent);
            }
        });

    }
}
