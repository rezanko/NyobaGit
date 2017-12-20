package com.crocodic.nyobagit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast();
    }

    /**
     * ini buat munculin toast "NJAJAL"
     */
    public void showToast(){
        //Ini untuk memunculkan toast
        //bagus to

        Toast.makeText(this, "NJAJAL BOR",Toast.LENGTH_LONG).show();
    }
    /**
     *iki di gunakan untuk mengakses tombol back fisik
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }



    public void nyobaNyoba(){
        //hai
        //bro
        //haha
        //popo
    }
}
