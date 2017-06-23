package com.example.android.muscialstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.muscialstructureapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMainActivity(this);
        setTitle(R.string.title_library);

        binding.btnPlaylists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startNewActivity(PlaylistsActivity.class);
            }
        });

        binding.btnArtists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startNewActivity(ArtistsActivity.class);
            }
        });

        binding.btnSongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startNewActivity(SongsActivity.class);
            }
        });

        binding.layNowPlaying.layoutPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startNewActivity(NowPlayingActivity.class);
            }
        });

    }

    private void startNewActivity(Class activityClass){

        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

}
