package com.example.mynewsapp;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URISyntaxException;

public class webViewController extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {


        if (url.startsWith("http") || url.startsWith("https")) {
            view.loadUrl(url);
        }
        if (url.startsWith("intent")) {

            try {
                Intent intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);

                String fallbackUrl = intent.getStringExtra("browser_fallback_url");
                if (fallbackUrl != null) {
                    view.loadUrl(fallbackUrl);
                    return true;
                }
            } catch (URISyntaxException e) {
                //not an intent uri
            }


        }
        return true;
    }
}
