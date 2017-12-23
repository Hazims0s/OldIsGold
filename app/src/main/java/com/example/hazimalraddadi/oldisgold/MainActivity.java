package com.example.hazimalraddadi.oldisgold;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Songs > songs= new ArrayList<Songs>() ;
        songs.add(new Songs("Sway","Classic Hits","Dean Martin", R.drawable.dean));
        songs.add(new Songs("Things","60's Hits","Nancy sinatra", R.drawable.nancy));
        songs.add(new Songs("Don't Fence me in","Single","Bing Crosby , The Andrews Sisters", R.drawable.bing));
        songs.add(new Songs("Guy is a Lover","Best of Cool Jazz","Dean Doris Day", R.drawable.doris));
        songs.add(new Songs("Hit the road","Ray Charles Collections","Ray Charles", R.drawable.ray));
        songs.add(new Songs("Walkin' After Midnight","Walkin' After Midnight","Pasty Cline", R.drawable.pasty));
        ListView lv = (ListView) findViewById(R.id.songlist);
       final  ListAdapter listAdapter = new ListAdapter(this,songs);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, nowPlayingActivity.class);
                intent.putExtra("Artwork", songs.get(position).getArtwork()) ;
                intent.putExtra("Name", songs.get(position).getName());
                startActivity(intent);}
        });}
}
