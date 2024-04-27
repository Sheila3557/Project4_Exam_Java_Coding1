package org.example;

public class Task1 {
    public static void main(String[] args) {

        //Write a program to swap 2 String without a temporary variable?

        String x = "Hello";
        String y = "Java";

        x = x +y;
        y = x.substring(0,(x).length()-y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);



    }
}
