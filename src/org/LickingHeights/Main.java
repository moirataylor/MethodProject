package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        String name;
       Scanner Keyboard;
       Keyboard = new Scanner(System.in);
       System.out.println("What's your name?");
       name = Keyboard.nextLine();
       helloName(name);


    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void helloName(String name) {
        System.out.println("Hello " + name);


    }

}

