package com.example.abhiram.doitnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtActivityName = (EditText) findViewById(R.id.edtNameOfActivity);
        Button btnExample = (Button) findViewById(R.id.btnExample);
        Button btnGo = (Button) findViewById(R.id.btnGo);



        btnGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AreYouDoing.class);
                intent.putExtra("ACTIVITY_NAME", edtActivityName.getText().toString());
                startActivity(intent);
            }
        });

        btnExample.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.watering_plants),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
