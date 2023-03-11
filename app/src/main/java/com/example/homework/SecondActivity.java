package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtWellcome,txtShow;
    CheckBox cbMusic , cbSport,cbBook,cbCoffe;
    Button btnShow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtWellcome =(TextView) findViewById(R.id.txtWellcome);
        cbBook =(CheckBox) findViewById(R.id.cbBook);
        cbSport =(CheckBox) findViewById(R.id.cbSport);
        cbCoffe =(CheckBox) findViewById(R.id.cbCoffe);
        cbMusic =(CheckBox) findViewById(R.id.cbMusic);
        txtShow =(TextView) findViewById(R.id.txtShow);
        btnShow =(Button) findViewById(R.id.btnShow);

        txtWellcome.setText("Hoşgeldin " + getIntent().getExtras().getString("Username"));

        btnShow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String strShow = "Benim hobilerim ";
                if (cbBook.isChecked()){
                    strShow += "Kİtap okumak ";
                }if (cbSport.isChecked()) {
                    strShow += "Spor yapmak ";
                }if (cbCoffe.isChecked()) {
                    strShow += "Kahve içmek ";
                }if (cbMusic.isChecked()) {
                    strShow = strShow + "Müzik dinlemek ";
                }
                txtShow.setText(strShow);
            }
        });

    }
}