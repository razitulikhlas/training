package com.razit.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.razit.training.basic.HomeFragment;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, HomeFragment.newInstance(null,null,null,null,null)).commit();
    }
}