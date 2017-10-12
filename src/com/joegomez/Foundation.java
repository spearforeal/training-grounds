package com.joegomez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joeandrewgomez on 10/12/17.
 */
public class Foundation extends Construction {
    boolean bword = false;
    Scanner scanner = new Scanner(System.in);
    String foundation;
    ArrayList<String> space = new ArrayList<>();

    public  Foundation() {
        this.foundation = foundation;
        this.space = space;
        System.out.println("Give me an idea of the how much space you need: ");
        while(bword=!false){
            scanner.hasNext();
            String i= scanner.nextLine();
            space.add(i);
            bword=true;
            break;
        }
        System.out.println("You'll need this amount " + space);


    }


}
