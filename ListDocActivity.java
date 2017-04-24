package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListDocActivity extends AppCompatActivity {

    ListView lv;
    List<String> l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_doc);
        lv = (ListView) findViewById(R.id.docs);
        l = new ArrayList<>();

        l.add("Morning (08:00am - 11:00am)");
        l.add("Noon (11:00am - 01:30pm)");
        l.add("Afternoon (02:00pm - 05:00pm)");
        l.add("Evening (04:30pm - 07:00pm)");
        l.add("Night (08:00pm - 00:30am)");
        lv.setAdapter(new ArrayAdapter<>(ListDocActivity.this, android.R.layout.simple_list_item_1, l));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListDocActivity.this, DoctorsActivity.class);
                /*Bundle b1 = getIntent().getExtras();
                String ind = Integer.toString(lv.getId());
                b1.putString("time", ind);
                i.putExtras(b1);*/
                startActivity(i);
            }
        });
    }
}
