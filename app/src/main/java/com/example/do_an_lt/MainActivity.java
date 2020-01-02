package com.example.do_an_lt;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.icu.lang.UCharacterEnums;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Taikhoan, Matkhau;
    Button Dangnhap,Dangki,Thoat;
    String ten,matkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ControlButton();
    }
    // Hủy
    private void ControlButton(){
        Thoat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,android.R.style.Widget_Material_Light);
        builder.setTitle(" Bạn Có muốn thoát không !");
        builder.setMessage(" Vui lòng xác nhận :)) ");
        builder.setIcon(android.R.drawable.alert_dark_frame);
        // lựa chọn thoát
        builder.setPositiveButton(" Có ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onBackPressed();
            }
        });
        // Lụa chọn k trở về đăng nhập
        builder.setNegativeButton("Không ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            Dangnhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent( MainActivity.this,com.example.do_an_lt.Dangki.class);
                    startActivity(intent);
                }
            });
            }
        });
        builder.show();
    }
});





        // chuyển trang đăng nhập
        Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Taikhoan.getText().length()!=0 && Matkhau.getText().length()!=0)
                {
                    if(Taikhoan.getText().toString().equals(ten) && Matkhau.getText().toString().equals(matkhau))
                    {
                        Toast.makeText(MainActivity.this," Đang Nhập thành công ",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,Dangnhap.class);
                        startActivity(intent);
                    }
                    else if(Taikhoan.getText().toString().equals("hung" )&& Matkhau.getText().toString().equals("123")){
                        Toast.makeText(MainActivity.this," Đang Nhập thành công ",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,Dangnhap.class);
                        startActivity(intent);
                    }
                        else{
                        Toast.makeText(MainActivity.this," Đang Nhập thất bại ",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this," Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_LONG).show();
                }





            }
        });

        final Button huy,dongy;
        final EditText user,pass;


        // Chuyển trang đăng kí
        Dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.dang_ky);
                 final EditText user = (EditText) dialog.findViewById(R.id.taikhoan_text);
                final EditText pass = (EditText)dialog.findViewById((R.id.matkhau_text));

                Button huy=(Button)dialog.findViewById(R.id.huy_button);
                Button dongy=(Button)dialog.findViewById(R.id.dongy_button);


                dongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ten = user.getText().toString().trim();
                        matkhau = pass.getText().toString().trim();

                        Taikhoan.setText(ten);
                        Matkhau.setText(matkhau);



                        dialog.cancel();

                    }
                });
                huy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                dialog.show();
            }
        });


    }
    private void Anhxa()
    {
        Taikhoan =(EditText) findViewById(R.id.TK_text);
        Matkhau = (EditText) findViewById(R.id.MK_text);


        Dangki=(Button) findViewById(R.id.dangki_button);
        Dangnhap=(Button) findViewById(R.id.dangnhap_button);

        Thoat=(Button)findViewById(R.id.huy_button);


    }


}
