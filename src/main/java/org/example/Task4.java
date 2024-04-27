package org.example;

public class Task4 {
    //Check if a String is Palindrome: Determine whether a given string is a
    ////palindrome, which means it reads the same forwards and backward. For
    ////example, "madam" is a palindrome

    public static void main(String[] args) {

        String given = "level";
        String reversed = new StringBuilder(given).reverse().toString();

        if (given.equals(reversed)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }

    }
}


