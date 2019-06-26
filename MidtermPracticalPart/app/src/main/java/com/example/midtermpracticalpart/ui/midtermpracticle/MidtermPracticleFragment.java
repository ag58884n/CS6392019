package com.example.midtermpracticalpart.ui.midtermpracticle;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.midtermpracticalpart.Output;
import com.example.midtermpracticalpart.OutputActivity;
import com.example.midtermpracticalpart.R;
import com.example.midtermpracticalpart.ui.output.OutputFragment;

public class MidtermPracticleFragment extends Fragment {

    private MidtermPracticleViewModel mViewModel;

    public static MidtermPracticleFragment newInstance() {
        return new MidtermPracticleFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.midterm_practicle_fragment, container, false);

    }
    public static final String EXTRA_MESSAGE ="com.example.MidtermPracticalPart.MESSAGE";

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MidtermPracticleViewModel.class);
        // TODO: Use the ViewModel


        Button button;
        button =(Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), Output.class);
                EditText editText;
                editText =(EditText) getActivity().findViewById(R.id.editText);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }

}
