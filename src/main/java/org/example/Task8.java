package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task8 {

        public static void main(String[] args) {

            ArrayList<String> words = new ArrayList<>();
            words.add("Apple");
            words.add("Kiwi");
            words.add("Ant");
            words.add("Banana");
            words.add("Butterfly");
            words.add("Attention");
            words.add("Camel");
            words.removeIf(x-> (x.charAt(0) !='A'));
            System.out.println(words);

            String str = words.toString();
            System.out.println(str.toLowerCase());

        }

    }
//You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case"

