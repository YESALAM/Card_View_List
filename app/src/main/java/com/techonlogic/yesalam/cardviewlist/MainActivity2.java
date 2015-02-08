package com.techonlogic.yesalam.cardviewlist;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }


    public void onClick(View view){
        int limit ;
        switch(view.getId()){

            case R.id.button1 :
                limit = 1;
                Intent intent = new Intent(this,MainActivity.class);
                intent.putExtra("limit",limit);
                startActivity(intent);
                break;
            case R.id.button2 :
                limit = 2;
                Intent intent2 = new Intent(this,MainActivity.class);
                intent2.putExtra("limit",limit);
                startActivity(intent2);
                break;
            case R.id.button3 :
                limit = 3;
                Intent intent3 = new Intent(this,MainActivity.class);
                intent3.putExtra("limit",limit);
                startActivity(intent3);
                break;
            case R.id.button4 :
                limit = 4;
                Intent intent4 = new Intent(this,MainActivity.class);
                intent4.putExtra("limit",limit);
                startActivity(intent4);
                break;
            case R.id.button5 :
                limit = 5;
                Intent intent5 = new Intent(this,MainActivity.class);
                intent5.putExtra("limit",limit);
                startActivity(intent5);
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
