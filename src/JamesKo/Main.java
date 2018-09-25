package JamesKo;

import java.util.Scanner;

import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomnum = (int) (15*Math.random()+1);
        System.out.println("What's the number?");
                        int number = input.nextInt();
                        while(number != randomnum)
                        {
                            System.out.print("Try Again!");
                            number = input.nextInt();
                        }
                                System.out.print("You got the Number!");


    }
}

