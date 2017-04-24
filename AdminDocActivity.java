package com.example.sample.healthmart;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminDocActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3;
    SQLiteDatabase sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_doc);
        ed1 = (EditText) findViewById(R.id.dname);
        ed2 = (EditText) findViewById(R.id.qualifi);
        ed3 = (EditText) findViewById(R.id.timings);
        sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        sq.execSQL("create table if not exists Doctors(name varchar2(10) primary key, qualification varchar(2), timing varchar(2));");
    }

    public void adddoc(View v) {
        String dname = ed1.getText().toString();
        String q = ed2.getText().toString();
        String t = ed3.getText().toString();
        sq.execSQL("insert into Doctors values('"+dname+"','"+q+"','"+t+"');");
        Toast.makeText(getApplication(),"New Doctor's Details Successfully Added!",Toast.LENGTH_LONG).show();
        Intent i = new Intent(AdminDocActivity.this, AdminSelectActivity.class);
        startActivity(i);
        finish();
    }
}
