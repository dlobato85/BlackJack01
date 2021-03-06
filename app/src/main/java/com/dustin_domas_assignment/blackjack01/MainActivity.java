package com.dustin_domas_assignment.blackjack01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action!!!!!!!!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        */

        //Code Below will declare play_button and take it to the next activity
        Button play_b = (Button) findViewById(R.id.play_button);
        play_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        PlayActivity.class); //Explicit intent

                startActivity(intent);
            }
        });// end of onclick



        Button rules_b = (Button) findViewById(R.id.rules_button);
        rules_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRules("https://www.pagat.com/banking/blackjack.html");
            }
        });  //end of onclick



        Button about_b = (Button) findViewById(R.id.about_button);
        about_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        AboutActivity.class);

                startActivity(intent);
            }
        }); // end of on click



    }


    private void  goToRules (String url) {
        Uri uri =  Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);  //implicit intent open anything what android wants
        startActivity(intent);
    }




}//end of MainActivity
