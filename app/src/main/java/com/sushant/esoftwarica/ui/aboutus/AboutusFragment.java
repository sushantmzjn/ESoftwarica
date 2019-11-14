package com.sushant.esoftwarica.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sushant.esoftwarica.R;

public class AboutusFragment extends Fragment {

    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_aboutus, container, false);
         webView = root.findViewById(R.id.webview);
         webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.softwarica.edu.np/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return root;
    }

}
