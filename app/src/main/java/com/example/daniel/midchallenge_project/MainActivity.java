package com.example.daniel.midchallenge_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daniel.midchallenge_project.R;

public class MainActivity extends AppCompatActivity {

    private NetworkComponent myNetComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
