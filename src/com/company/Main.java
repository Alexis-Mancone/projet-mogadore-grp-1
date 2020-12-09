package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        char menu = 'm';        //to know where the player is in the menu 'p'; 's'; 'q';

        while (menu != 'q'){    //to quit the program
            menu = com.company.menu.menu(menu);
        }
        System.out.println("Goodbye, thanks for playing");
    }


}

