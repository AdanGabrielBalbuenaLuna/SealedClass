package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create an global variable
    private MediaPlayer mediaPlayerObject ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Use Class to create object, is not necessary to declare the type of the object
        mediaPlayerObject = MediaPlayer.create(this, R.raw.when_you_were_young);

        //Bound the button
        Button playButton = (Button) findViewById(R.id.button);
        //Add listener to a button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerObject.start();
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
            }
        });

        mediaPlayerObject.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(), "I´m Done",Toast.LENGTH_SHORT).show();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.button2);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerObject.pause();
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
            }
        });

        Button stopButton = (Button) findViewById(R.id.button3);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayerObject.stop();
                Toast.makeText(getApplicationContext(), "Stop sound",Toast.LENGTH_SHORT).show();
            }
        });
    }
}