package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_select);
    }

    public void newmed(View v) {
        Intent i = new Intent(AdminSelectActivity.this, AdminActivity.class);
        startActivity(i);
        finish();
    }

    public void newdoc(View v) {
        Intent i = new Intent(AdminSelectActivity.this, AdminDocActivity.class);
        startActivity(i);
        finish();
    }
}
