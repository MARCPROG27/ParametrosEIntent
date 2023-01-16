package com.example.parametroseintent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.parametroseintent.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding mBinding;

    public SecondFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment secondFragment = new SecondFragment();
        Bundle args = new Bundle();
        return secondFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentSecondBinding.inflate(inflater, container, false);
        return mBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //CON WEBVIEW NOS COMUNICAMOS Y MOSTRAMOS UN SITIO EN INTERNET; EN ESTE CASO UN SITIO DEL TIEMPO
        WebView webview = (WebView) mBinding.webview;
        webview.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://www.accuweather.com/es/cl/santiago/60449/weather-forecast/60449");
    }

}