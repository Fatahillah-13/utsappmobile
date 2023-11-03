package com.example.loginretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityHome extends AppCompatActivity {
    TextView tvwelcome;
    Button btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        //getSupportActionBar().setTitle("Halaman Depan");
        tvwelcome = (TextView) findViewById(R.id.tvWelcome);
        btnkeluar = (Button) findViewById(R.id.btnLogout);
        String username = getIntent().getStringExtra("username").toString();
        String email = getIntent().getStringExtra("email").toString();
        tvwelcome.setText("Selamat Datang : "+username+"("+email+")");
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityHome.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}