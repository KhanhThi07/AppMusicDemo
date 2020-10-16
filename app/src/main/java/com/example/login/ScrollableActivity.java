package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ScrollView;

public class ScrollableActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.scrollable);
        ScrollView container = (ScrollView) findViewById(R.id.container);
        getLayoutInflater().inflate(R.layout.activity_listmusic, container);
    }
}
