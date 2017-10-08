package com.ieglobe.electionapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ieglobe.electionapp.R;

public class MainActivity extends AppCompatActivity {

    private Context context;
    String Act_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void loginType(View view){
        Intent intent = new Intent(context,LoginType.class);
        intent.putExtra("type","login");

        //intent.putExtra(Constants.INTENT_TYPE,Constants.TYPE_LOGIN);
        startActivity(intent);

    }
    public void register(View view){
        Intent intent = new Intent(context,LoginType.class);
        intent.putExtra("type","register");
        startActivity(intent);
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
