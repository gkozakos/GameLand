package games;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userChoice;
        String computerChoice;
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!\n" +
                "Please enter a move.\n" + "R = Rock \n" + "P = Paper \n" + "S = Scissors");

        System.out.println();

        computerInt = generator.nextInt(3) + 1;

//        option 1
//        if (computerInt == 1)
//            computerChoice = "R";
//        else if (computerInt == 2)
//            computerChoice = "P";
//        else if (computerInt == 3)
//            computerChoice = "S";

        switch (computerInt) {
            case 1:
                computerChoice = "R";
                break;
            case 2:
                computerChoice = "P";
                break;
            default:
                computerChoice = "S";
        }

        System.out.println("Enter your play: ");
        userChoice = scan.next();

        userChoice = userChoice.toUpperCase();

        System.out.println("Computer play is: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("R")) {
            if (computerChoice.equals("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else {
                System.out.println("Paper eats rock. You lose!!");
            }
        } else if (userChoice.equals("P")) {
            if (computerChoice.equals("S")) {
                System.out.println("Scissor cuts paper. You lose!!");
            } else {
                System.out.println("Paper eats rock. You win!!");
            }
        } else if (userChoice.equals("S")) {
            if (computerChoice.equals("P")) {
                System.out.println("Scissor cuts paper. You win!!");
            } else {
                System.out.println("Rock breaks scissors. You lose!!");
            }
        } else {
            System.out.println("Invalid user input.");
        }
    }
}

