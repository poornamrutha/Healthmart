package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView tv1, tv2;
    EditText ed;
    String medname;
    String cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ed = (EditText) findViewById(R.id.quan_val);
        tv1 = (TextView) findViewById(R.id.medname_val);
        tv2 = (TextView) findViewById(R.id.cost_val);
        Bundle b1 = getIntent().getExtras();
        medname = b1.getString("medicine");
        Bundle b2 = getIntent().getExtras();
        cost = b2.getString("cost");
        tv1.setText(medname);
        tv2.setText(cost);
    }

    public void placeorder(View v) {
        Bundle b3 = new Bundle();
        b3.putString("medicine", medname);
        Bundle b4 = new Bundle();
        b4.putString("cost", cost);
        Bundle b5 = new Bundle();
        String quantityy = ed.getText().toString();
        b5.putString("quan", quantityy);
        Intent i = new Intent(ResultsActivity.this, PlacingOrderActivity.class);
        i.putExtras(b3);
        i.putExtras(b4);
        i.putExtras(b5);
        startActivity(i);
    }
}
