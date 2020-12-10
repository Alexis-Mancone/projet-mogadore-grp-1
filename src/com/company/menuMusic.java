package com.company;

import java.util.Scanner;

public class menuMusic {
    public static void printError() {
        /**
         * When you write something wrong the function will send you the error message and allow you to start over
         */
        System.out.println("Not a valid command");
    }
    public static char menuMusic(char menuMusic) {
        Playlist playlist1 = new Playlist();
        Scanner menuMusicSc = new Scanner(System.in);
        String chooseMenuMusic;

        switch (menuMusic) {

            case 'M' -> {
                System.out.println(
                        "    \nWelcome\n" +
                                "        You can choose between:\n" +
                                "---------------------------------------------------------------\n" +
                                "|Press 'playlist','p' to add or remove a song to your playlist|\n" +
                                "|Press 'listen','l' to listen your playlist                   |\n" +
                                "|Press 'quit','q' to return at the menu                       |\n" +
                                "---------------------------------------------------------------\n"
                );
                chooseMenuMusic = menuMusicSc.next();
                //the menu for music-related features
                switch (chooseMenuMusic) {
                    case "Playlist", "playlist", "p" -> menuMusic = 'p';
                    case "Listen", "listen", "l" -> menuMusic = 'l';
                    case "Quit", "quit", "q" -> menuMusic = 'm';
                    default -> printError();
                }
            }

            case 'p' -> {

                for (int i = 0; i < playlist1.playlist.size(); i++) {
                    Song song = playlist1.playlist.get(i);
                    String songName = song.getTitle();
                    String songArtist = song.getArtist();
                    String songDuration = song.getDuration();
                    System.out.println((i + 1) + ". " + songName + " by " + songArtist + " (duration: " + songDuration + " mn)");
                }

                System.out.println("\n" + "Type 'Add' to add a song to playlist or 'Remove' to remove a song");
                String playlistMenuInput = menuMusicSc.nextLine();


                switch (playlistMenuInput) {
                    case "add", "Add" -> {
                        //add a song in the playlist
                        System.out.println("Song title: ");
                        String title = menuMusicSc.next();
                        System.out.println("Song artist: ");
                        String artist = menuMusicSc.next();
                        System.out.println("Song duration: ");
                        String duration = menuMusicSc.nextLine();
                        playlist1.addSong(title, artist, duration);
                    }
                    case "remove", "Remove" -> {
                        //remove a song from the playlist
                        System.out.println("Type the song number to remove it from the playlist");
                        int songNumber = menuMusicSc.nextInt();
                        playlist1.removeSong(songNumber);
                    }
                }
                System.out.println("Press 'r','return' to return to the menu");
                //a scanner that allows you to return to either the playlist management menu or the main menu
                chooseMenuMusic = menuMusicSc.next();
                switch (chooseMenuMusic) {
                    case "return", "r" -> menuMusic = 'M';
                    case "Quit", "quit", "q" -> menuMusic = 'm';
                    default -> printError();
                }


            }
            case 'l' -> {
                while ( true ) {
                    //listen function
                    for (int i = 0; i < playlist1.playlist.size(); ) {

                        Song song = playlist1.playlist.get(i);
                        String songName = song.getTitle();
                        String songArtist = song.getArtist();
                        String songDuration = song.getDuration();
                        System.out.println("Now playing : " + songName + " by " + songArtist + ". (Duration : " + songDuration + " mn)");

                        System.out.println("\n" + "Type 'Next' to skip song or 'Previous' to play last song");
                        /**
                         *
                         * javadoc
                         *
                         */
                        loop:
                        while ( true ) {
                            Scanner playingMenuSc = new Scanner(System.in);
                            String playingMenu;
                            playingMenu = playingMenuSc.next();
                            switch (playingMenu) {
                                default -> printError();
                                case "Next", "next" -> {
                                    i++;
                                    if (i == playlist1.playlist.size()) {
                                        i = 0;
                                    }
                                    break loop;
                                }
                                case "Previous", "previous" -> {
                                    i--;
                                    if (i < 0) {
                                        i = 0;
                                    }
                                    break loop;
                                }
                            }
                        }

                    }

                }
            }
        }
        return menuMusic;
    }
}

