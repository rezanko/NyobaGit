package com.crocodic.nyobagit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    /**
     *iki di gunakan untuk mengakses tombol back fisik
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
