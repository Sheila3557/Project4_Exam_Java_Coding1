package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {

        // How can you remove all duplicates from ArrayList?
        ArrayList<String> names = new ArrayList<>();
        names.add ("Charlie");
        names.add ("Buttons");
        names.add ("Bear");
        names.add ("Chase");
        names.add ("Coco");
        names.add ("Buttons");
        names.add ("Coco");
        names.add ("Chase");

        Set<String> newList =new HashSet<>(names);
        System.out.println(newList);




    }
}

