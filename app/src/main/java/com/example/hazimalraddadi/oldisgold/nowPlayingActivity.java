package com.example.hazimalraddadi.oldisgold;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class nowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ImageView artworkImgview = (ImageView) findViewById(R.id.nowPlayingArtworkImgview) ;
        TextView songNameTxtview =(TextView) findViewById(R.id.songNameTxtview);
        Intent intent= getIntent() ;
        songNameTxtview.setText(intent.getStringExtra("Name"));
        artworkImgview.setImageResource( intent.getIntExtra("Artwork",0));
        Button backToSongListBtn = (Button) findViewById(R.id.backToSongLisrtBtn);
        backToSongListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onClickIntent = new Intent(nowPlayingActivity.this, MainActivity.class);
                startActivity(onClickIntent);}
            }
        );
    }
}
