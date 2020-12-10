package com.company;

import java.util.Scanner;

public class gameMenu {
    public static void printError(){
        /**
         * When you write something wrong the function will send you the error message and allow you to start over
         */
        System.out.println("Not a valid command");
    }
    public static char gameMenu (char gameMenu){
        Scanner gameMenuSc = new Scanner(System.in);
        String chooseGameMenu;
        switch (gameMenu){
            case 'G' -> {
                System.out.println(
                        "    \nWelcome\n"+
                        "        You can choose between:\n"+
                        "---------------------------------------------------------------\n"+
                        "|  Press 'play','p' to play at Colossal Cave                  |\n"+
                        "|  Press 'rules','ru' to to access the rules                  |\n"+
                        "|  Press 'quit','q' to return at the menu                     |\n"+
                        "---------------------------------------------------------------\n"
                );
                //a scanner that allows you to play the game, access rules or return to the main menu
                chooseGameMenu = gameMenuSc.next();
                switch (chooseGameMenu) {
                    case "Play", "play", "p" -> gameMenu = 'p';
                    case "Rules", "rules", "ru" -> gameMenu = 'r';
                    case "Quit", "quit", "q" -> gameMenu = 'm';
                    default -> printError();
                }
            }
            case'p'->{
                //the function to play should be here
                System.out.println("play");

                System.out.println("Press 'r','return' to return to the menu or 'q','quit' to quit the program");
                //a scanner that allows you to return to either the game menu or the main menu
                chooseGameMenu = gameMenuSc.next();
                switch (chooseGameMenu) {
                    case "return", "r" -> gameMenu = 'G';
                    case "Quit", "quit", "q" -> gameMenu = 'm';
                    default -> printError();
                }
            }
            case'r'->{

                System.out.println("rules");

                System.out.println("Press 'r','return' to return to the menu or 'q','quit' to quit the program");
                //a scanner that allows you to return to either the game menu or the main menu
                chooseGameMenu = gameMenuSc.next();
                switch (chooseGameMenu) {
                    case "return", "r" -> gameMenu = 'G';
                    case "Quit", "quit", "q" -> gameMenu = 'm';
                    default -> printError();
                }
            }
        }
        return gameMenu;
    }
}
