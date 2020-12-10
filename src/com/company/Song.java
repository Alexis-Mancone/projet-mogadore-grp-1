package com.company;

public class Song {
    private String title;
    private String artist;
    private String duration;


    public Song(String songTitle, String songArtist, String duration){
        this.title = songTitle;
        this.artist = songArtist;
        this.duration = duration;
    }


    // Getter and Setter Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    // Getter and Setter Artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    // Getter and Setter Duration
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString(){
        return "Title: " + getTitle() + ", Artist: " + getArtist() + ", Duration: " + getDuration();
    }
}
