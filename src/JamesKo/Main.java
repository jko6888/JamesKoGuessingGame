package JamesKo;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What's your name?");
        String person = name.nextLine();
        Scanner game = new Scanner(System.in);
        System.out.println("Do you want the computer or user to guess?");
        Scanner difficulty = new Scanner(System.in);
        String me = game.nextLine();
        int chose = 0;
        if(me.toLowerCase().equals("computer")){
            boolean correct = false;
            int low = 1;
            int high = 100;
            int choice = 50;
            while(correct != true){
                choice = (low + high)/2;
                System.out.println("" + person + " , is the number greater, less, or equal to " + choice + "?");
                Scanner test = new Scanner(System.in);
                String str = test.nextLine();
                if(str.toLowerCase().equals("greater")){
                    low = (low + high)/2;
                    if(low%2 == 1){
                        low++;
                    }
                }
                else if(str.toLowerCase().equals("less")){
                    high = choice;
                }
                else if(str.toLowerCase().equals("equal")){
                    System.out.println("I got your number!");
                    correct = true;
                }
                else{
                    chose--;
                }
                chose++;
            }
        }
        else if(me.toLowerCase().equals("user")){
            System.out.println(person + ",Choose a difficulty(1,2,3 or 4)");
            int mode = difficulty.nextInt();
            double a = Math.pow(10,mode);
            Scanner test = new Scanner(System.in);
            int randomNumber = (int)(a*Math.random())+1;
            System.out.println("Pick a number between 1 and " + (int)a);
            int guess = test.nextInt();
            while(guess != randomNumber){
                System.out.println("Incorrect!");
                chose++;
                guess = test.nextInt();
            }
            chose++;
            System.out.println("You got the number!");
        }
        else{
            System.out.println("You did not choose one of the decisions! Start over!");
        }
        System.out.println("The game ended in " + chose + " guesses!");
    }
}
