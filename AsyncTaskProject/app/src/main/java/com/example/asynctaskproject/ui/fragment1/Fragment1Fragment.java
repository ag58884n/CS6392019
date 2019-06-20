package com.example.asynctaskproject.ui.fragment1;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
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

import javax.net.ssl.HttpsURLConnection;

public class Fragment1Fragment extends Fragment {

    ImageView i;
    private Fragment1ViewModel mViewModel;

    public static Fragment1Fragment newInstance() {
        return new Fragment1Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        String url = "https://raw.githubusercontent.com/ag58884n/CS6392019/master/AsyncTaskProject/655370-ahmedabad-022618-02.jpg";
        View view = inflater.inflate(R.layout.fragment1_fragment, container, false);
        i = view.findViewById(R.id.imageView);
        new GetAsyncImage().execute(url);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("AHMEDABAD, INDIA");
        return view;
    }

    private class GetAsyncImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Bitmap doInBackground(String... parms) {

            Bitmap bitmap = null;
            try {
                URL url = new URL(parms[0]);
                HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
                if(con.getResponseCode() != 200){
                    throw new Exception("Failed to Connect");
                }
                InputStream is = con.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            }catch(Exception e){
                Log.e("Image", "Failed to load Image", e);
                Log.e("error", e.getMessage());
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            i.setImageBitmap(bitmap);

        }
    }

}
