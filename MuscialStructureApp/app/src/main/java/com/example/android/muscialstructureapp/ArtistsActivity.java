package com.example.android.muscialstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.muscialstructureapp.databinding.ActivityArtistsBinding;

public class ArtistsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ActivityArtistsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_artists);
        binding.setArtists(this);

        binding.btnLibrary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

        binding.layNowPlaying.layoutPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
