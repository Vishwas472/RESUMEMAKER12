package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class persnoaldetails extends AppCompatActivity {
     Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persnoaldetails);
        Initview();
    }

    private void Initview() {
        btnsave=findViewById(R.id.btnsave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent A=new Intent(persnoaldetails.this,resumemaker.class);
                startActivity(A);
            }
        });






    }
}