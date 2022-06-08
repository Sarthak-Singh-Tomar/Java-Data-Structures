package com.sarttech;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {

        //create array
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        //Read Array
        System.out.println(colors);
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        //update array
        colors[2] ="yellow";
        System.out.println(Arrays.toString(colors));

        //create arrays if numbers are known
        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        // loop in Array 1
        for(int i=0;i<colors.length;i++) {
            System.out.println(colors[i]);
        }

        //reverse an array using loop 1
        for(int i=colors.length-1;i>=0;i--) {
            System.out.println(colors[i]);
        }

        // loop in Array 2
        for(String color : colors) {
            System.out.println(color);
        }

        //loop in Array 3
        Arrays.stream(colors).forEach(System.out::println);





    }
}
