package com.example.sample.healthmart;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {

    EditText ed1, ed2;
    SQLiteDatabase sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        ed1 = (EditText) findViewById(R.id.newmed);
        ed2 = (EditText) findViewById(R.id.newcost);
        sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        sq.execSQL("create table if not exists Medicine(name varchar2(10) primary key, costper int);");
    }
    public void add(View v) {
        String name = ed1.getText().toString();
        String cost = ed2.getText().toString();
        sq.execSQL("insert into Medicine values('"+name+"','"+cost+"');");
        Toast.makeText(getApplicationContext(),"Added successfully!",Toast.LENGTH_LONG).show();
        Intent i = new Intent(AdminActivity.this, AdminSelectActivity.class);
        startActivity(i);
        finish();
    }
}
