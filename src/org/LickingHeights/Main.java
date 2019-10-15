package org.LickingHeights;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        String name;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        System.out.println("name");
        name = Keyboard.nextLine();
        helloName(name);
        
       int a = 5;
       int b = 3;
       System.out.println(multiply(a,b));
       System.out.println(divide(a,b));
       System.out.println(maxNumber(a,b));

        String word;
        String word2;
        word = "shark";
        word2 = "head";
        changeWord(word,word2);




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
        if (a < b) {
            return a;
        }
        else if (a > b){
            return b;
        }
        else return b;
    }
    public static String changeWord(String word, String word2) {
       System.out.println(word2+word);
        return word2+word;
    }


}

