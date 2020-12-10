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
