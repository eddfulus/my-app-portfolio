package com.example.eddfulus.myportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showMessage(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer App",
                Toast.LENGTH_LONG).show();
    }

    public void showMessage2(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Scores App",
                Toast.LENGTH_LONG).show();
    }

    public void showMessage3(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Library App",
                Toast.LENGTH_LONG).show();
    }

    public void showMessage4(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger App",
                Toast.LENGTH_LONG).show();
    }

    public void showMessage5(View view){
        Toast.makeText(getApplicationContext(),"This button will launch my Bacon Reader App",
                Toast.LENGTH_LONG).show();
    }

    public void showMessage6(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Capstone: My Own App",
                Toast.LENGTH_LONG).show();
    }



}
