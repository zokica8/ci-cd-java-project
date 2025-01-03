package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var number = new Random().nextInt(1, 101);
        var guesses = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number between 1 and 100");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter valid input!");
                scanner.nextLine();
                guesses++;
                continue;
            }
            var numberGuess = scanner.nextInt();
            guesses++;
            if (numberGuess < 1 || numberGuess > 100) {
               System.out.println("Please enter valid number!");
               continue;
            }
            if (numberGuess == number) {
                System.out.println("Congratulations, you guessed the number!");
                System.out.println("Number of gueeses: " + guesses);
                return;
            }
            else {
                showWrongNumberText(number, numberGuess);
            }
        }
    }

    private static void showWrongNumberText(int number, int numberGuess) {
        if (number < numberGuess) {
            System.out.println("Number is lower, try again");
        }
        else {
            System.out.println("Number is higher, try again");
        }
    }
}