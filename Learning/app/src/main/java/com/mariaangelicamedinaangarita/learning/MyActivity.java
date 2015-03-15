package com.mariaangelicamedinaangarita.learning;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.mariaangelicamedinaangarita.learning.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.mariaangelicamedinaangarita.learning.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.mariaangelicamedinaangarita.learning.MESSAGE3";

    String whatever = new String();
    String test = "hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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

     public void sendMessage (View view){

         //Hello this is a comment. The preview line was to import the library of view. Hold alt plus enter to import it.
         Intent intent = new Intent (this, DisplayMessageActivity.class);
         EditText editText = (EditText) findViewById(R.id.edit_message);
         String message = editText.getText().toString();
         intent.putExtra(EXTRA_MESSAGE,message);
         //startActivity(intent);

         //Intent intent2 = new Intent (this, DisplayMessageActivity.class);
         EditText editText2 = (EditText) findViewById(R.id.edit_message2);
         String message2 = editText2.getText().toString();
         intent.putExtra(EXTRA_MESSAGE2,message2);
         //startActivity(intent2);

         //Intent intent3 = new Intent (this, DisplayMessageActivity.class);
         EditText editText3 = (EditText) findViewById(R.id.edit_message3);
         String message3 = editText3.getText().toString();
         intent.putExtra(EXTRA_MESSAGE3,message3);

         startActivity(intent);



     }
}

