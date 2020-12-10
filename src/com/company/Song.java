package com.company;

public class Song {
    private String title;
    private String artist;
    private double duration;


    public Song(String songTitle, String songArtist, double duration){
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
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String toString(){
        return "Title: " + getTitle() + ", Artist: " + getArtist() + ", Duration: " + getDuration();
    }
}
