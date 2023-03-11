package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    Button btnEnter;
    EditText txtUsername , txtPassword;
    TextView txtWarning;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnter =(Button) findViewById(R.id.btnEnter);
        txtUsername =(EditText) findViewById(R.id.txtUsername);
        txtPassword =(EditText) findViewById(R.id.txtPassword);
        txtWarning =(TextView) findViewById(R.id.txtWarning);


        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(txtUsername.getText().toString()) | TextUtils.isEmpty(txtPassword.getText().toString()))
                {
                    txtUsername.setError("Alanın dolu olduğundan emin ol!");
                    txtPassword.setError("Alanın dolu olduğundan emin ol!");
                }
                else
                {
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    String str = txtUsername.getText().toString();
                    intent.putExtra("Username",str);
                    startActivity(intent);
                    finish();


                }

            }
        });

    }
}