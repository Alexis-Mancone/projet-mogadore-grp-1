package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends Song{

    // Creation of a list of objects playlist
    private List<Song> playlist = new ArrayList<>();

    public Playlist(String title, String author, double duration) {
        super(title, author, duration);
    }

    // Method to add son object in the playlist
    public void addSong(Song song){
        playlist.add(song);
    }

    public void playSong(Song song){

    }
}
