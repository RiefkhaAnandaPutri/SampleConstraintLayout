package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //mendeklarasikan avriabel dengan tipe data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menguhbungkan variabel txPassword dengan componen TextView pada Layout
        txPassword = findViewById(R.id.tvPassword);


        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci a
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sbelumnya dengan kunci b
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txPassword
        txPassword.setText(pass);
    }
}
