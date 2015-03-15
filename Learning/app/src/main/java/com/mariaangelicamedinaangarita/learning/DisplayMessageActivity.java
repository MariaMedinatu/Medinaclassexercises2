package com.mariaangelicamedinaangarita.learning;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_display_message);
       Intent intent = getIntent();

        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MyActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MyActivity.EXTRA_MESSAGE3);
        TextView textView = (TextView) findViewById(R.id.txtView1);
        TextView textView2 = (TextView) findViewById(R.id.txtView2);


        //TextView textView = new TextView(this);
       // TextView textView2 = new TextView(this);
       // TextView textView3 = new TextView(this);
       // textView.setTextSize(40);
      //  textView2.setTextSize(40);
      //  textView3.setTextSize(40);
        textView.setText(message);
        textView2.setText(" becomes "+message2+" and goes to "+message3);


        //setContentView(textView);
        //setContentView(textView2);
        //setContentView(textView3);




    }

    private void createDisplayContext(String s) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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
