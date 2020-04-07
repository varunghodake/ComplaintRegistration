package com.starlord.complaint_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class complain extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        btn1=findViewById(R.id.b1);

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(complain.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Hostel));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(myAdapter);

        Spinner sp1=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter1=new ArrayAdapter<String>(complain.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.About));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(myAdapter1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(complain.this, Final.class));
                complain.this.finish();
            }
        });
    }
    public void onBackPressed()
    {
        startActivity(new Intent(complain.this, MainActivity.class));
    }
}
