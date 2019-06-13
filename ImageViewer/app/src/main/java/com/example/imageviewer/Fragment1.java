package com.example.imageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.imageviewer.ui.fragment1.Fragment1Fragment;

public class Fragment1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment1Fragment.newInstance())
                    .commitNow();
        }
    }
}
