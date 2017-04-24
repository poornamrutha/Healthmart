package com.example.sample.healthmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlacingOrderActivity extends AppCompatActivity {

    TextView tv, tv1, tv2, tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placing_order);
        tv = (TextView) findViewById(R.id.orderid_val);
        tv1 = (TextView) findViewById(R.id.medname_val);
        tv2 = (TextView) findViewById(R.id.quantity_val);
        tv3 = (TextView) findViewById(R.id.totalcost_val);
        Bundle b1 = getIntent().getExtras();
        String medname = b1.getString("medicine");
        Bundle b2 = getIntent().getExtras();
        String cost = b2.getString("cost");
        Bundle b3 = getIntent().getExtras();
        String quan = b3.getString("quan");
        String oid = "GHX45R6";
        tv.setText(oid);
        tv1.setText(medname);
        tv2.setText(quan);
        int total;
        total = Integer.parseInt(cost) * Integer.parseInt(quan);
        String totcost = "Rs. "+ total;
        tv3.setText(totcost);
    }

    public void confirmorder(View v) {
        Toast.makeText(getApplicationContext(),"Your order has been placed!",Toast.LENGTH_LONG).show();
        Intent i = new Intent(PlacingOrderActivity.this, SearchActivity.class);
        startActivity(i);
        finish();
    }
}
