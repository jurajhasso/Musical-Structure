package com.example.android.musical_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musical_structure.R.id.search_play;

/**
 * Created by XY on 7.5.2017.
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_album);

        Button album_play = (Button) findViewById(R.id.album_play);

        album_play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(AlbumActivity.this, PlayingActivity.class);

                startActivity(playingIntent);
            }
        });
    }
}