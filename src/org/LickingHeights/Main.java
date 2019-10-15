package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        int firstNumber,secondNumber;
       String name;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("name");
        name = Keyboard.nextLine();

       int a = 5;
       int b = 3;
       System.out.println(multiply(a,b));
       System.out.println(divide(a,b));
       System.out.println(maxNumber(a,b));





    }

    public static void helloWorld() {

        System.out.println("Hello World");
    }

    public static String helloName(String name) {
      return "Hello " + name;
    }


    public static int multiply(int a, int b ){
        int answer = a*b;
        return answer;
    }
    public static double divide(double a, double b){
        return a/b;
    }
    public static double maxNumber(double a, double b){
        if (a < b);
        return a;
    }
  


}

