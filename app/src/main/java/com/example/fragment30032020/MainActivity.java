package com.example.fragment30032020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Cách 1 : Add xml fragment

        //Cách 2 : Add code fragment
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.linearContainer,androidFragment);
        fragmentTransaction.commit();
    }
}