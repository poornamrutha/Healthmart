package com.example.sample.healthmart;

//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DoctorsActivity extends AppCompatActivity {

    TextView tv1, tv2;
    String name;
    String qual;
    String time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        tv1 = (TextView) findViewById(R.id.docname);
        tv2 = (TextView) findViewById(R.id.qual);
        //sq = openOrCreateDatabase("CustomerDB", Context.MODE_PRIVATE, null);
        //sq.execSQL("create table if not exists Doctors(name varchar2(10) primary key, qualification varchar(2), timing varchar(2));");
        //Bundle b1 = getIntent().getExtras();
        //time = b1.getString("time");
        setValue();
    }

    public void setValue() {
        //if (time.equals("1")) {
            name = "Dr.JAGANATHAN";
            qual = "MBBS, Cardiology";
        /*}
        else if (time.equals("1")) {
                name = "Dr.RAMANATHAN";
                qual = "MBBS, Pediatrics";
        }
        else if (time.equals("1")) {
                name = "Dr.PRIYA";
                qual = "MBBS, Neurology";
        }
        else if (time.equals("1")) {
                name = "Dr.VIDHYA";
                qual = "MBBS, Gynaecology";
        }
        else if (time.equals("1")) {
                name = "Dr.GANESH";
                qual = "MBBS, Orthopedics";
        }*/
        tv1.setText(name);
        tv2.setText(qual);
    }
    public void visit(View v) {
        Toast.makeText(getApplicationContext(),"Your appointment has been fixed! Intimation will be done!",Toast.LENGTH_LONG).show();
    }
}