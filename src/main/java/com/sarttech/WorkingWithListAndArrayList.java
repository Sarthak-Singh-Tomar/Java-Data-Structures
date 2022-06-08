package com.sarttech;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListAndArrayList {
    public static void main(String[] args) {
        //create an ArrayList by implementing List
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");

        //to find size of list
        System.out.println(colors.size());
        System.out.println(colors);

        //loop on List
        for (String color : colors) {
            System.out.println(color);
        }

        //for each loop
        colors.forEach(System.out::println);
    }
}
