package org.example;

public class Task6 {
    public static void main(String args[]){
            /*6. Create a method to count how many vowels are present in a string
“documentation”*/

        String str="documentation";
        System.out.println(str.replaceAll("[^aeiouAEIOU]","").length());
    }
}


