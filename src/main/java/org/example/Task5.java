package org.example;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

    //heck if Two Strings are Anagrams: Given two strings, determine if they
        ////are anagrams, meaning they contain the same characters in a different order.
        ////For example, "listen" and "silent" are anagrams.

    String str1 = "listen";
    String str2 = "silent";

        if (str1.length() == str2.length()) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean result = Arrays.equals(charArray1, charArray2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }
}



        }
