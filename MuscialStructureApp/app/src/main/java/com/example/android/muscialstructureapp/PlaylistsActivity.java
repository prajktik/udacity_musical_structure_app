package com.example.android.muscialstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.android.muscialstructureapp.databinding.ActivityPlaylistsBinding;

public class PlaylistsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ActivityPlaylistsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_playlists);
        binding.setPlaylists(this);

        binding.btnCreateNewPlaylist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(PlaylistsActivity.this, R.string.create_new_playlist, Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnLibrary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

        binding.layNowPlaying.layoutPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
