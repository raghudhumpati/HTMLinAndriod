package com.example.raghu.htmlinandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv=(WebView)findViewById(R.id.myhtml);
        s= "<html><body><B>WELCOME TO HTML CODE IN ANDRIOD</B><body></html>";

        wv.loadData(s,"text/html","utf-8");
    }
}
