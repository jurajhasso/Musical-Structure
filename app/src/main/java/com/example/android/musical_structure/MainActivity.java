package com.example.android.musical_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button playing = (Button) findViewById(R.id.playing);

        playing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);

                startActivity(playingIntent);
            }
        });

        Button search = (Button) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                startActivity(searchIntent);
            }
        });

        Button albums = (Button) findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent albumsIntent = new Intent(MainActivity.this, AlbumActivity.class);

                startActivity(albumsIntent);
            }
        });

        Button songs = (Button) findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);

                startActivity(songIntent);
            }
        });
    }
}
