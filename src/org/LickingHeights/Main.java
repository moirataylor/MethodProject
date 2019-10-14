package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        String name;
        int firstNumber,secondNumber;
       Scanner Keyboard;
       Keyboard = new Scanner(System.in);
       System.out.println("What's your name?");
       name = Keyboard.nextLine();
       helloName(name);
       int a = 5;
       int b = 3;
       System.out.print(multiply(a,b));




    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void helloName(String name) {
        System.out.println("Hello " + name);
    }
    public static int multiply(int a, int b ){
        int answer = a*b;
        return answer;
    }
    


}

