package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void ordernow(View v) {
        Intent i = new Intent(SelectActivity.this, SearchActivity.class);
        startActivity(i);
    }

    public void getappoint(View v) {
        Intent i = new Intent(SelectActivity.this, ListDocActivity.class);
        startActivity(i);
    }

    public void logout(View v) {
        Intent i = new Intent(SelectActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
