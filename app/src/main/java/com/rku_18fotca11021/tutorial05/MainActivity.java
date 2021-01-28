package com.rku_18fotca11021.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    EditText edtFname;
    EditText edtLname;
    EditText edtEmail;
    EditText edtPassword;
    Switch switchBranch;
    Spinner spnCity;
    CheckBox chkStatus;
    RadioGroup rdoGroup;
    RadioButton rdoGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.btnRegister);
        edtFname = findViewById(R.id.edtFname);
        edtLname = findViewById(R.id.edtLname);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        switchBranch = findViewById(R.id.switchBranch);
        spnCity = findViewById(R.id.spnCity);
        chkStatus = findViewById(R.id.chkStatus);
        rdoGroup = findViewById(R.id.rdgGender);




        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = rdoGroup.getCheckedRadioButtonId();
                rdoGender = findViewById(id);
                String tdo = rdoGender.getText().toString();


                String name = edtFname.getText().toString();
                String name1 = edtLname.getText().toString();
                String name2 = edtEmail.getText().toString();
                String name3 = edtPassword.getText().toString();


                String country = spnCity.getSelectedItem().toString();

                String status = "";
                String branch = "";
                if (switchBranch.isChecked())
                {
                    branch = switchBranch.getTextOn().toString();
                }
                else
                {
                    branch = switchBranch.getTextOff().toString();
                }
                if (chkStatus.isChecked())
                {
                    status = "Active";
                }
                else
                {
                    status = "Inactive";
                }


               // Toast.makeText(MainActivity.this, branch, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",name);
                i.putExtra("name1",name1);
                i.putExtra("name2",name2);
                i.putExtra("name3",name3);
                i.putExtra("country",country);
                i.putExtra("status",status);
                i.putExtra("branch",branch);
                i.putExtra("tdo",tdo);




                startActivity(i);

//                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, name1, Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, name2, Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, name3, Toast.LENGTH_SHORT).show();

//                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();

//                Toast.makeText(MainActivity.this, status, Toast.LENGTH_SHORT).show();

            }
        });

    }
}