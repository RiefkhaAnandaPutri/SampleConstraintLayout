package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //mendeklarasikan variabel dengan tipe data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //mengubungkan variael txEmail dengan componen Txview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txEmail dengan componen Textview pada layout
        txPassword = findViewById(R.id.tvPassword);

        //membuat objek bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untukmenyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci a
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci b
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //mendeklarasikan value dari variaek pass kedalam txPassword
        txPassword.setText(pass);
    }
}