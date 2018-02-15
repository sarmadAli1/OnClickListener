package com.example.sarmad.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText mUserName, mPassword;
    Button mSignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mUserName =(EditText) findViewById(R.id.etUserName);
        mPassword =(EditText) findViewById(R.id.etPassword);
        mSignIn =(Button) findViewById(R.id.btnSign);
        mSignIn.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Successfully SignIn",Toast.LENGTH_LONG).show();
    }
}
