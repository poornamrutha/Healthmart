package com.example.sample.healthmart;

//import android.content.Context;
import android.content.Context;
import android.content.Intent;
//import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5;
    SQLiteDatabase sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.password);
        ed3 = (EditText) findViewById(R.id.mail);
        ed4 = (EditText) findViewById(R.id.address);
        ed5 = (EditText) findViewById(R.id.contact);
        sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        sq.execSQL("create table if not exists Customers(username varchar2(10) primary key, password varchar(20), mailid varchar(20), address varchar(20), contact number(10));");
    }

    public void register(View v) {
        String username = ed1.getText().toString();
        String password = ed2.getText().toString();
        String mailid = ed3.getText().toString();
        String address = ed4.getText().toString();
        String contact = ed5.getText().toString();
        sq.execSQL("insert into Customers values('"+username+"','"+password+"','"+mailid+"','"+address+"','"+contact+"');");
        Toast.makeText(getApplicationContext(),"Registration Successful!",Toast.LENGTH_LONG).show();
        Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(),"Pls login now!",Toast.LENGTH_LONG).show();
        finish();
    }
}
