package com.example.norbis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText bemenet = findViewById(R.id.bemenet);
        Button gomb = findViewById(R.id.gomb);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, MasikActivity.class);
                i.putExtra("bemenet", bemenet.getText().toString());

                startActivity(i);
            }
        });


    }
}