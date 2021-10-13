package com.example.unwind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton habit_tracker_button;
    private ImageButton calm_button;
    private ImageButton my_team_button;
    private ImageButton my_profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        habit_tracker_button = (ImageButton) findViewById(R.id.habit_tracker_button);
        habit_tracker_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhabittracker();
            }


        });

        calm_button = (ImageButton) findViewById(R.id.calm_button);
        calm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_calm();
            }


        });

        my_team_button = (ImageButton) findViewById(R.id.my_team_button);
        my_team_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_my_team();
            }


        });

        my_profile_button = (ImageButton) findViewById(R.id.my_profile_button);
        my_profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmy_profile();
            }


        });



    }

    public void openhabittracker(){
        Intent intent = new Intent(this, habit_tracker.class);
        startActivity(intent);
    }

    public void open_calm(){
        Intent intent = new Intent(this, calm.class);
        startActivity(intent);
    }

    public void open_my_team(){
        Intent intent = new Intent(this, my_team.class);
        startActivity(intent);
    }

    public void openmy_profile(){
        Intent intent = new Intent(this, my_profile.class);
        startActivity(intent);
    }
}