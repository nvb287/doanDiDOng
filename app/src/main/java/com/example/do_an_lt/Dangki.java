package com.example.do_an_lt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Dangki extends AppCompatActivity {
    Button huy,dangky;
    EditText user,password,repass;
    String ten,matkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_ky);
        Anhxa();
        ControlButton();
    }



private void ControlButton(){

    huy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Dangki.this,android.R.style.Widget_Material_Light);
            builder.setTitle(" Bạn có muốn thoát không ? ");
            builder.setMessage(" Vui lòng xác nhận :)) ");
            builder.setIcon(android.R.drawable.alert_dark_frame);
            // thoát chương trình
            builder.setPositiveButton("Có ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    onBackPressed();
                }
            });

            //trở về đăng nhập
            builder.setNegativeButton(" Không ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();

        }
    });


    dangky.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            final EditText Tentk = (EditText)findViewById(R.id.taikhoan_text);
            final EditText pass = (EditText)findViewById(R.id.matkhau_text);


            Button btnHuy= (Button)findViewById(R.id.huy_button);
            final Button btndangki=(Button)findViewById(R.id.dongy_button);

            btndangki.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     ten = Tentk.getText().toString().trim();
                    matkhau = pass.getText().toString().trim();


                    user.setText(ten);
                    password.setText(matkhau);


                }
            });
           // Intent intent = new Intent(Dangki.this,com.example.do_an_lt.MainActivity.class);
           // startActivity(intent);
            btnHuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    });


}
    private void Anhxa(){
        huy = (Button) findViewById(R.id.huy_button);
        dangky=(Button)findViewById(R.id.dongy_button);
        user=(EditText)findViewById(R.id.taikhoan_text);
        password=(EditText)findViewById(R.id.matkhau_text);


    }

}
