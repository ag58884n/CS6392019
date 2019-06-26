package com.example.midtermpracticalpart.ui.output;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.midtermpracticalpart.R;
import com.example.midtermpracticalpart.ui.midtermpracticle.MidtermPracticleFragment;

public class OutputFragment extends Fragment {

    private OutputViewModel mViewModel;

    public static OutputFragment newInstance() {
        return new OutputFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.output_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OutputViewModel.class);
        // TODO: Use the ViewModel
        Intent intent = getActivity().getIntent();
        String message = intent.getStringExtra(MidtermPracticleFragment.EXTRA_MESSAGE);
        double x= 586.84;
        String str3 = message;
        double var3 = Double.valueOf(str3);
        double result = x * var3;
        String finalresult = String.valueOf(result);
        TextView textView = getActivity().findViewById(R.id.textView2);
        textView.setText(finalresult);
    }

}
