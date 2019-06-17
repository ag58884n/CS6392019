package com.example.menuproject.ui.fragment1;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.menuproject.R;

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
    private static final String TAG = "MainActivity";

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Fragment1ViewModel.class);
        // TODO: Use the ViewModel
        Button button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: done ");
                Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
                sendIntent.setData(Uri.parse("sms:" + Uri.encode("5162898218")));
                sendIntent.putExtra("sms_body","Aditya Gajjar");
                startActivity(sendIntent);
            }
        });

        Button button2 = (Button) getActivity().findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent dialintent = new Intent(Intent.ACTION_DIAL);
                dialintent.setData(Uri.parse("tel:5162898218"));
                startActivity(dialintent);
            }
        });

        Button button3 = (Button) getActivity().findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent internetintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
                startActivity(internetintent);
            }
        });

        Button button4 = (Button) getActivity().findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "onClick: MAP");
                String geoUri = String.format("geo:23.0554,72.5053");
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
                startActivity(geoMap);
            }
        });

        Button button5 = (Button) getActivity().findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "onClick: Share");
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "CS639");
                intent.putExtra(Intent.EXTRA_TEXT,"Join CS639");
                startActivity(Intent.createChooser(intent,"Sharing The Love"));
            }
        });

    }

}
