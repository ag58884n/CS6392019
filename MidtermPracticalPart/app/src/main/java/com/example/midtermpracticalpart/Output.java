package com.example.midtermpracticalpart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.midtermpracticalpart.ui.output.OutputFragment;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, OutputFragment.newInstance())
                    .commitNow();
        }
    }
}
