package com.rku_18fotca11021.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView txtfname, txtlname, txtemail, txtpassword, txtcountry, txtstatus, txtbranch, txtrdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtfname = findViewById(R.id.txtnfame);
        txtlname = findViewById(R.id.txtlname);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        txtcountry = findViewById(R.id.txtcountry);
        txtstatus = findViewById(R.id.txtstatus);
        txtbranch = findViewById(R.id.txtbranch);
        txtrdo = findViewById(R.id.txtrdo);




        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String name1 = bundle.getString("name1");
        String name2 = bundle.getString("name2");
        String name3 = bundle.getString("name3");
        String country = bundle.getString("country");
        String status = bundle.getString("status");
        String branch = bundle.getString("branch");
        String tdo = bundle.getString("tdo");





        txtfname.setText("First Name"+" : "+name);
        txtlname.setText("Last Name"+" : "+name1);
        txtemail.setText("Email"+" : "+name2);
        txtpassword.setText("Password"+" : "+name3);
        txtcountry.setText("Country"+" : "+country);
        txtstatus.setText("Status"+" : "+status);
        txtbranch.setText("branch"+" : "+branch);
        txtrdo.setText("branch"+" : "+tdo);




//        Toast.makeText(MainActivity2.this, name, Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity2.this, name1, Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity2.this, name2, Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity2.this, name3, Toast.LENGTH_SHORT).show();

//        Toast.makeText(MainActivity2.this, country, Toast.LENGTH_SHORT).show();

//        Toast.makeText(MainActivity2.this, status, Toast.LENGTH_SHORT).show();

    }
}