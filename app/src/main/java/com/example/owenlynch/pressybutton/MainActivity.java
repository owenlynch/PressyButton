package com.example.owenlynch.pressybutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView totalResult;
    EditText percentageTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button calcButton = (Button) findViewById(R.id.calcButton);

        totalResult = (TextView) findViewById(R.id.totalResult);

        percentageTxt = (EditText) findViewById(R.id.percentageTxt);
        numberTxt = (EditText) findViewById(R.id.numberTxt);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float result = 0f;
                try {
                    float percentage = Float.parseFloat(percentageTxt.getText().toString());
                    float decimal = percentage / 100;
                    result = decimal * Float.parseFloat(numberTxt.getText().toString());
                } catch (NumberFormatException nfe) {

                }


                totalResult.setText(Float.toString(result));


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
