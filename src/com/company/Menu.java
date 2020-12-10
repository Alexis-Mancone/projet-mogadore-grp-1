package com.company;

import java.util.Scanner;


public class Menu {
    public static void printError() {
        /**
         * When you write something wrong the function will send you the error message and allow you to start over
         */
        System.out.println("Not a valid command");
    }

    public static char menu(char menu){
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
                        "    \nWelcome\n" +
                                "        You can choose between:\n" +
                                "---------------------------------------------------------------\n" +
                                "|  Press 'play', 'p' : to play at Colossal Cave               |\n" +
                                "|  Press 'song', 's' : to listen music                        |\n" +
                                "|  Press 'quit', 'q' : to quit the system                     |\n" +
                                "---------------------------------------------------------------\n"
                );
                chooseMenu = sc.next();
                //a scanner that allows access to the game menu or the playlist management menu or to exit the program
                switch (chooseMenu) {
                    case "p", "play" -> menu = 'p';
                    case "s", "song" -> menu = 's';
                    case "q", "quit", "exit" -> menu = 'q';
                    default -> printError();
                }
            }

            case 'p' -> {
                //call menu to play at Colossal cave
                char gameMenu = 'G';

                while ( gameMenu != 'm' ) {    //to quit the menu
                    gameMenu = com.company.gameMenu.gameMenu(gameMenu);
                }
                return 'm';

            }

            case 's' -> {
                //call menu to listen the music
                char menuMusic = 'M';

                while ( menuMusic != 'm' ) {    //to quit the menu
                    menuMusic = com.company.menuMusic.menuMusic(menuMusic);
                }
                return 'm';

            }

        }
        return menu;
    }
}
