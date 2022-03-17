package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk menampilkan menu;
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //method untuk memanggil activity "DaftarActivity"
            Intent i = new Intent(getApplicationContext(), Pendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    //deklarasi variabel untuk button
    Button btnLogin;

    //deklarasi variabel untuk editText
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //manghubungkan variabel btnlogin denga componen button pada layout
        btnLogin= findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "admin@mail.com";

                //mengeset password yang benar
                String pass = "123";

                //mengecek apakah edittext email dan password terdapat isi atau tidak
                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variabel toast dan mmmbuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi!!", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                } else {
                    //mengecek apakah isi dari email dan password sudah sama dengan email dan
                    //password yang sudah diset
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat varibael toast dan menampilkan pesan "login sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        //Menampilkan toast
                        t.show();

                        //membuat objek bundle
                        Bundle b = new Bundle();

                        //memasukkan value dari variabel nama dengan kunci "a"
                        //dan dimasukkan kedalam bundle
                        b.putString("a", nama.trim());

                        //memasukkan value dari variabel password dengan kunci "b"
                        //dan dimasukkan kedalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke activityHasil
                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        //membuat bundle kedalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(i);
                        else {
                            //membuat varibel toast dan membuat toast dan menampilkan pesan "Login Gagal"

                            Toast t = Toast.makeText(getApplicationContext(),
                                    "Login Gagal", Toast.LENGTH_LONG);

                            //Menampilkan toast
                            t.show();
                        }
                    }

                }


            }
        });
    }
}