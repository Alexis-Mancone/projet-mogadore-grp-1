package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    // Creation of a list of objects playlist
    List<Song> playlist = new ArrayList<>();


    // Method to add son object in the playlist
    public void addSong(String title, String artist, String duration){
        Song song = new Song(title, artist, duration);
        playlist.add(song);
    }

    public void playSong(Song song){

    }
}
