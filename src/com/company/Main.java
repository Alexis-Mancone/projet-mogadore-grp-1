package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        char menu = 'm';        //to know where the player is in the menu '...'; '...'; 'q';

        while (menu != 'q'){
            menu = com.company.menu.menu(menu);
        }
        System.out.println("Goodbye, thanks for playing");
    }


}

