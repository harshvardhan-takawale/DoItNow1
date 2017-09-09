package com.example.abhiram.doitnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by abhiram on 8/28/2017.
 */

public class AreYouDoing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.areyoudoing);
        Intent intent = getIntent();
        String nameOfActivity = intent.getExtras().getString("ACTIVITY_NAME");

        Button btnareyoudoing_go = (Button) findViewById(R.id.btnareyoudoing_go);

    TextView txtActivityName = (TextView) findViewById(R.id.txtAreYouDoing);
        txtActivityName.setText("Are you " + nameOfActivity + " now?");

        final RadioButton radio_yes = (RadioButton) findViewById(R.id.radio_yes);
        final RadioButton radio_no = (RadioButton) findViewById(R.id.radio_no);

        radio_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_yes.isChecked()){
                    radio_no.setChecked(false);
                }
            }
        });

        radio_no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(radio_no.isChecked()){
                    radio_yes.setChecked(false);
                }
            }
        });

        btnareyoudoing_go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if(radio_yes.isChecked()){
                    Intent intentcongrats = new Intent(AreYouDoing.this,Congrats.class);
                    startActivity(intentcongrats);
                }
                if(radio_no.isChecked()){
                    Intent intentwhatareyoudoing = new Intent(AreYouDoing.this,Whatareyoudoingnow.class);
                    startActivity(intentwhatareyoudoing);

                }
            }
        });


}
}
