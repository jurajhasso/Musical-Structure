package com.example.android.musical_structure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musical_structure.R.id.previous_play;
import static com.example.android.musical_structure.R.id.search_play;

/**
 * Created by XY on 7.5.2017.
 */

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_playing);

        Button next_play = (Button) findViewById(R.id.next_play);

        next_play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(PlayingActivity.this, PlayingActivity.class);

                startActivity(playingIntent);
            }
        });

        Button previous_play = (Button) findViewById(R.id.previous_play);

        previous_play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(PlayingActivity.this, PlayingActivity.class);

                startActivity(playingIntent);
            }
        });
    }
}