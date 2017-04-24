package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*b1 = (Button) findViewById(R.id.signin);
        b2 = (Button) findViewById(R.id.notmem);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You're being directed to login page!",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You're being directed to registration page!",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });*/
    }

    public void startApp(View v) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void notmember(View v) {
        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);
    }
}
