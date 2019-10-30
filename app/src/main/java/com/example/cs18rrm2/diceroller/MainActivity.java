package com.example.cs18rrm2.diceroller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.Random;

import static android.view.View.*;
import static com.example.cs18rrm2.diceroller.R.id.textView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final EditText userNumber;
        Button submitButton;

        userNumber = (EditText) findViewById(R.id.EditText);
        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            public void on_button_click(View view) {
                TextView myText = (TextView) findViewById(textView);
                Random r = new Random();
                int number = r.nextInt(6) + 1;
                myText.setText(Integer.toString(number));
                try {
                    int theNumber;
                    switch (theNumber = Integer.parseInt(userNumber.getText().toString()))

                    if (theNumber < 1 || theNumber > 6)
                        if (number == theNumber)
                            Toast.makeText(MainActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();

                } catch (Exception er) {
                    Toast.makeText(MainActivity.this, "invalid number", Toast.LENGTH_SHORT).show();
                }
            }
        },
        setContentView(R.layout.activity_main));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

    public void generate (View view){
        Random rand = new Random();
        int number = rand.nextInt (6)+1;
        TextView myText = (TextView)findViewById(textView);
        String myString = String.valueOf(number);
        myText.setText(myString);
    }




}
