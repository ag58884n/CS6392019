package com.example.midtermpracticalpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.midtermpracticalpart.ui.midtermpracticle.MidtermPracticleFragment;

public class midterm_practicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midterm_practicle_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MidtermPracticleFragment.newInstance())
                    .commitNow();
        }
    }
}
