package org.example;

public class Task2 {
    //Find out how many alpha characters are present in a string?
    public static void main(String[] args) {

        String str = "bjbkjkjRTGCGHc6546746%#$#";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());




    }
}
