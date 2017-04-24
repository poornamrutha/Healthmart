package com.example.sample.healthmart;

//import android.content.Context;
import android.content.Intent;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    EditText ed;
    //SQLiteDatabase sq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ed = (EditText) findViewById(R.id.searchh);
        //sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        //sq.execSQL("create table if not exists Medicine(name varchar2(10) primary key, costper int);");
    }

    public void search(View v) {
        String str = ed.getText().toString();
        /*Cursor c = sq.rawQuery("select * employee where name='" +str+ "';", null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {*/
        if(str.equals("dolo650")) {
            //String med = c.getString(0);
            //String cost = c.getString(1);
            Bundle b1 = new Bundle();
            b1.putString("medicine", "dolo650");
            Bundle b2 = new Bundle();
            b2.putString("cost", "10");
            Intent i = new Intent(SearchActivity.this, ResultsActivity.class);
            i.putExtras(b1);
            i.putExtras(b2);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"Medicine not available!",Toast.LENGTH_LONG).show();
        }
                /*} while (c.moveToNext());
            }
        }*/

    }
}
