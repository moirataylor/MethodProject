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
       double x = 




    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static String helloName(String name) {
      return "Hello "+ name;
    }
    public static int multiply(int a, int b ){
        int answer = a*b;
        return answer;
    }
    public static double divide(double x, double y){
        return x/y;
    }


}

