package com.example.sample.healthmart;

//import android.content.Context;
import android.content.Intent;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText ed1, ed2;
    //SQLiteDatabase sq;
    //Button b1;
    //Cursor c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1 = (EditText) findViewById(R.id.email);
        ed2 = (EditText) findViewById(R.id.pwd);
        //b1 = (Button) findViewById(R.id.login);
        //sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        //sq.execSQL("create table if not exists Customers(username varchar2(10) primary key not null, password varchar(20) not null, mailid varchar(20) not null, address varchar(20) not null, contact number(10) not null);");
        //sq.execSQL("insert into Customers values('admin','health','admin@gmail.com','1012 admin avenue',9087654360);");
        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ed1.getText().toString();
                String password = ed2.getText().toString();
                if(username.equals("admin")) {
                    if(password.equals("healthmart")) {
                        Toast.makeText(getApplicationContext(),"Login successful! Hello "+username+" !",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(LoginActivity.this, AdminSelectActivity.class);
                        startActivity(i);
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Username and Password mismatch!",Toast.LENGTH_LONG).show();
                }
                else {
                    Cursor c = sq.rawQuery("select * from customers where username='" + username + "';", null);
                    try {
                        if (c != null) {
                            if (c.moveToFirst()) {
                                do {
                                    String pwd = c.getString(1);
                                    if (password.equals(pwd)) {
                                        Toast.makeText(getApplicationContext(), "Login successful! Hello " + username + " !", Toast.LENGTH_LONG).show();
                                        Intent i = new Intent(LoginActivity.this, SelectActivity.class);
                                        startActivity(i);
                                        break;
                                    }
                                } while (c.moveToNext());
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Invalid Username or Password!", Toast.LENGTH_LONG).show();
                        }
                        try {
                            c.close();
                        }
                        catch(NullPointerException ne) {
                            Toast.makeText(getApplicationContext(),"Null Pointer Exception!",Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Sorry! An Exception occurred!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });*/
    }

    public void login(View v) {
        String username = ed1.getText().toString();
        String password = ed2.getText().toString();
        if((username.equals("admin")) &&(password.equals("health"))) {
                Toast.makeText(getApplicationContext(),"Login successful! Hello " + username + " !",Toast.LENGTH_LONG).show();
                Intent i = new Intent(LoginActivity.this, AdminSelectActivity.class);
                startActivity(i);
        }
        else if(username.equals("customer1") && password.equals("health")) {
                Toast.makeText(getApplicationContext(),"Login successful! Hello " + username + " !",Toast.LENGTH_LONG).show();
                Intent i = new Intent(LoginActivity.this, SelectActivity.class);
                startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"Invalid!",Toast.LENGTH_LONG).show();
        }
    }
}

