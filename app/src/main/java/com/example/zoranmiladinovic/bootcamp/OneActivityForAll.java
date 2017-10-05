package com.example.zoranmiladinovic.bootcamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OneActivityForAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_for_all);
    }

    public void nextLevel(View view) {
        Intent intent = new Intent(this, Gallery.class);
    }
}
