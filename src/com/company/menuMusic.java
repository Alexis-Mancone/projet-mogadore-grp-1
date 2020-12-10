package com.company;

import java.util.Scanner;

public class menuMusic {
    public static void printError(){
        /**
         * When you write something wrong the function will send you the error message and allow you to start over
         */
        System.out.println("Not a valid command");
    }
    public static char menuMusic (char menuMusic){
        Playlist playlist1 = new Playlist();
        Scanner menuMusicSc = new Scanner(System.in);
        String chooseMenuMusic;
        switch (menuMusic){
            case 'M' -> {
                System.out.println(
                        "    \nWelcome\n"+
                        "        You can choose between:\n"+
                        "---------------------------------------------------------------\n"+
                        "|Press 'playlist','p' to add or remove a song to your playlist|\n"+
                        "|Press 'listen','l' to listen your playlist                   |\n"+
                        "|Press 'quit','q' to return at the menu                       |\n"+
                        "---------------------------------------------------------------\n"
                );
                chooseMenuMusic = menuMusicSc.next();
                switch (chooseMenuMusic) {
                    case "Playlist", "playlist", "p" -> menuMusic = 'p';
                    case "Listen", "listen", "l" -> menuMusic = 'l';
                    case "Quit", "quit", "q" -> menuMusic = 'm';
                    default -> printError();
                }
            }
            case'p'->{

                System.out.println("add/remove song");
                //add/remove function
                Scanner musicSc = new Scanner(System.in);

                System.out.println("song title: ");
                String title = musicSc.nextLine();
                System.out.println("song artist: ");
                String artist = musicSc.nextLine();
                System.out.println("song duration: ");
                String duration = musicSc.nextLine();


                playlist1.addSong(title, artist, duration);


                System.out.println("Press 'r','return' to return to the menu");
                chooseMenuMusic = menuMusicSc.next();
                switch (chooseMenuMusic) {
                    case "return", "r" -> menuMusic = 'M';
                    default -> printError();
                }
            }
            case'l'->{
                System.out.println("listen");
                //listen function

                for (int i = 0; i < playlist1.playlist.size();) {

                    Song song = playlist1.playlist.get(i);
                    String songName = song.getTitle();
                    String songArtist = song.getArtist();
                    String songDuration = song.getDuration();
                    System.out.println("Now playing : " + songName + " by " + songArtist + ". (Duration : " + songDuration + " mn)");

                    System.out.println("\n" + "Type 'Next' to skip song or 'Previous' to play last song");
                    Scanner scPlaying = new Scanner(System.in);

                    loop : while (true) {
                        String playingMenu = scPlaying.nextLine();
                        switch (playingMenu) {
                            case "Next", "next" -> {
                                i++;
                                break loop;
                            }
                            case "Previous","previous" -> {
                                i--;
                                break loop;
                            }
                            default -> printError();
                        }
                    }




                }

                System.out.println("Press 'r','return' to return to the menu");
                chooseMenuMusic = menuMusicSc.next();
                switch (chooseMenuMusic) {
                    case "return", "r" -> menuMusic = 'M';
                    default -> printError();
                }
            }
        }
        return menuMusic;
    }
}
