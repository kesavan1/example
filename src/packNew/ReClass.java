package packNew;

import java.util.Scanner;

public class ReClass {

    public static void main(String[] args){

        takeAStep();
    }

    static void takeAStep(){
            System.out.println("you have taken a step");
            takeAStep();
    }
}
