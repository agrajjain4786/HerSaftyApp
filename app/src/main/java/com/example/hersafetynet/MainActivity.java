package com.example.hersafetynet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button CNAbtn,EULbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CNAbtn = (Button) findViewById(R.id.CNAbtn);
        EULbtn = (Button) findViewById(R.id.EULbtn);

        CNAbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),NewUser.class);
                startActivity(intent);
            }
        });
        EULbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),OldUser.class);
                startActivity(intent);
            }
        });




    }
}