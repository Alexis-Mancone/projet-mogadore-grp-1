package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends SongDriver {

    // Creation of a list of objects playlist
    List<Song> playlist = new ArrayList<>();

    public Playlist() {
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        playlist.add(song4);
        playlist.add(song5);
        playlist.add(song6);
    }

    // Method to add song object in the playlist
    public void addSong(String title, String artist, String duration){
        Song song = new Song(title, artist, duration);
        playlist.add(song);
    }

    //public void removeSong (String title) {}


    // Method to remove song object from playlist
    public void removeSong (int index) {
        playlist.remove(index);
    }



    public void playSong(Song song){

    }
}
