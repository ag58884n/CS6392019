package com.example.asynctaskproject.ui.fragment1;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asynctaskproject.MainActivity;
import com.example.asynctaskproject.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Fragment1Fragment extends Fragment {

    private Fragment1ViewModel mViewModel;

    public static Fragment1Fragment newInstance() {
        return new Fragment1Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1_fragment, container, false);
    }
    private static final String TAG="MainActivity";
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Fragment1ViewModel.class);
        // TODO: Use the ViewModel
        Button button =(Button) getActivity().findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                ImageView imageView = getActivity().findViewById(R.id.imageView);
                Glide.with(getActivity().getApplicationContext()).load("https://raw.githubusercontent.com/ag58884n/CS6392019/master/AsyncTaskProject/655370-ahmedabad-022618-02.jpg")
                        .placeholder(R.drawable.ic_autorenew_black_24dp)
                        .error(R.drawable.ic_error_black_24dp)
                        .into(imageView);
                TextView textView = getActivity().findViewById(R.id.textView);
                textView.setText("AHMEDABAD");
            }
        });
    }

}
