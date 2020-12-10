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

                System.out.println("Press 'r','return' to return to the menu");
                chooseMenuMusic = menuMusicSc.next();
                switch (chooseMenuMusic) {
                    case "return", "r" -> menuMusic = 'M';
                    default -> printError();
                }
            }
            case'l'->{
                System.out.println("listen");

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
