package com.joegomez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joeandrewgomez on 10/12/17.
 */
public class Construction {
    //ArrayList<Integer>menWeNeed = new ArrayList<>();
    //Scanner scanner = new Scanner(System.in);

    public Construction() {

    }
    public static void workingMen(){
        ArrayList<Integer>menWeNeed = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many men do you need? ");

        int i = scanner.nextInt();
        if(int p = 0; p<i; p++){
            menWeNeed.add(i);
        }

        System.out.println("Ok. you need " + menWeNeed + " guys.");
    }
}
