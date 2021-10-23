package com.example.biodata;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telepon(View view) {
        Uri uri = Uri.parse("tel:082136231954");
        Intent it = new Intent (Intent.ACTION_VIEW, uri );
        startActivity(it);

    }
    public void alamat(View view) {
        Uri uri = Uri.parse("geo:-6.977087, 110.462935");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);


    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"zulfikarikajaya@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}