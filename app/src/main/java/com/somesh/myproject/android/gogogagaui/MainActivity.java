package com.somesh.myproject.android.gogogagaui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout myprofile,preferences,support,flames,signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myprofile = findViewById(R.id.myprofile);
        preferences = findViewById(R.id.preferences);
        support = findViewById(R.id.support);
        flames  = findViewById(R.id.flames);
        signout = findViewById(R.id.signout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }
}
