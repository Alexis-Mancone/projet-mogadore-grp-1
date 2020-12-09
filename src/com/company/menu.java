package com.company;
import java.util.Scanner;
public class menu{
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
                System.out.println("    \nWelcome\n");
                System.out.println("        You can choose between:\n");
                System.out.println("---------------------------------------------------------------");
                System.out.println("||");
                System.out.println("||");
                System.out.println("|     'quit', 'q' : to quit the system                        |");
                System.out.println("---------------------------------------------------------------");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "q", "quit", "exit" -> menu = 'q';
                    case "e", "re" -> menu = 'e';//changer de "..."
                    case "z", "rz" -> menu = 'z';//changer de "..."
                    default -> printError();
                }
            }

            case 'e' -> {//changer de "..."
                System.out.println();

                System.out.println("");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "r", "return", "exit" -> menu = 'm';
                    case "q", "quit" -> menu = 'q';
                    default -> printError();
                }
            }

            case 'z' -> {//changer de "..."

                System.out.println("Press any button to return to the menu");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "r", "return", "exit" -> menu = 'm';
                    case "q", "quit" -> menu = 'q';
                }
            }

        }
        return menu;
    }
}
