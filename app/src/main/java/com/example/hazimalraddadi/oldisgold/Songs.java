package com.example.hazimalraddadi.oldisgold;


public class Songs {

    String Name ;
    String Album ;
    String Artist ;
    int Artwork;

    public Songs(String name, String album, String artist, int artwork) {
        Name = name;
        Album = album;
        Artist = artist;
        Artwork = artwork;
    }

    public String getName() {
        return Name;
    }

    public String getAlbum() {
        return Album;
    }

    public String getArtist() {
        return Artist;
    }

    public int getArtwork() {
        return Artwork;
    }}
