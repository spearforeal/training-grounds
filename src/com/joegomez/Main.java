package com.joegomez;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       ArrayList<String> objects = new ArrayList<>();
       ArrayList<Integer> intList = new ArrayList<>();
       objects.add("word one");
       objects.add("word two");

       System.out.println("This is what I have so far: " + objects);
       intList.add(393);
       intList.add(1, 4555);
       intList.add(2, 3444);
        System.out.println("This is what I have going on: " + intList);
        System.out.println(intList.size());
        System.out.println("\rOk...for loop time.");
        for(int counter = 0; counter<intList.size(); counter++){
            System.out.println(counter);
        }
        System.out.println("\rThat was easy...how about a more advance loop then");
        for(Integer num : intList){
            System.out.println(num);
        }
        System.out.println("\rLets try a while loop now.");
        int count = 0;
        while(intList.size()>count){
            System.out.println(count);
            count++;
        }
        System.out.println("Lets find out what a iterator is: ");
        Iterator iter = intList


    }

}
