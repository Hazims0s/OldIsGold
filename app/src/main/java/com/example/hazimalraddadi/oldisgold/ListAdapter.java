package com.example.hazimalraddadi.oldisgold;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


  
public class ListAdapter extends ArrayAdapter<Songs> {

    public ListAdapter(@NonNull Context context, @NonNull ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View listItemView = view;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list, viewGroup, false);
        }
        Songs songs = getItem(i);
        ImageView artworkImgview = (ImageView) listItemView.findViewById(R.id.artworkImgv) ;
        TextView songNameTxtview =(TextView) listItemView.findViewById(R.id.songNameTxtview);
        TextView albumTxtview =(TextView) listItemView.findViewById(R.id.albumTxtview);
        TextView artistTxtview =(TextView) listItemView.findViewById(R.id.artistTxtview);
        songNameTxtview.setText(songs.getName());
        albumTxtview.setText(songs.getAlbum());
        artistTxtview.setText(songs.getArtist());
        artworkImgview.setImageResource( songs.getArtwork());
        return listItemView;
    }
}
