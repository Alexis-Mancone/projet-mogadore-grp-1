package com.company;

import java.util.Scanner;

public class Menu {
    public static void printError(){
        /**
         * When you write something wrong the function will send you the error message and allow you to start over
         */
        System.out.println("Not a valid command");
    }
    public static char menu (char menu){
        /**
         * retrieves information sent by the user
         */
        Scanner sc = new Scanner(System.in);
        String chooseMenu;

        switch (menu) {
            /**
             *This switch allows you to have an interactive menu
             */
            case 'm' -> {
                System.out.println(
                        "    \nWelcome\n"+
                        "        You can choose between:\n"+
                        "---------------------------------------------------------------\n"+
                        "|     'play', 'p' : to play at Colossal Cave                  |\n"+
                        "|     'song', 's' : to listen music                           |\n"+
                        "|     'quit', 'q' : to quit the system                        |\n"+
                        "---------------------------------------------------------------\n"
                );
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "p", "play" -> menu = 'p';
                    case "s", "song" -> menu = 's';
                    case "q", "quit", "exit" -> menu = 'q';
                    default -> printError();
                }
            }

            case 'p' -> {
                //call function "play" for colossal cave



                System.out.println("Press 'r','return' to return to the menu or 'q','quit' to quit the program");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "r", "return", "exit" -> menu = 'm';
                    case "q", "quit" -> menu = 'q';
                    default -> printError();
                }
            }

            case 's' -> {

                Playlist playlist1 = new Playlist();

                //call function "music" to listen music
                System.out.println("");//menu for music to choose what you want


                System.out.println("Type in 'play' to start listening your playlist");
                for (int i = 0; i < playlist1.playlist.size(); i++) {
                    playlist1.playlist.get(1);

                    System.out.println("Now playing : ");
                }


                Scanner musicSc = new Scanner(System.in);

                System.out.println("Type in title, artist and duration");
                String title = musicSc.nextLine();
                String artist = musicSc.nextLine();
                String duration = musicSc.nextLine();


                playlist1.addSong(title, artist, duration);
                System.out.println(playlist1.playlist);


                System.out.println("Press 'r','return' to return to the menu or 'q','quit' to quit the program");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "r", "return", "exit" -> menu = 'm';
                    case "q", "quit" -> menu = 'q';
                    default -> printError();
                }
            }

        }
        return menu;
    }
}
