/*
 * A simple guessing game program
 * Note: the generated "secret" number will depend on the seed value given
 * If the game is played with the same seed value, the same secret number will be chosen each time.
 */
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the seed value for the random number generator:");
        int seed = scnr.nextInt();
        Random r = new Random(seed);
        int secretNum = r.nextInt(100) + 1;

        //TODO: Complete the program

        System.out.println("Guess the number (1-100):");

        int userInput = scnr.nextInt();
        int inputCounter = 0;

        while (userInput != secretNum) {
            if (userInput < secretNum) {
                System.out.println("Too low. Guess again. You've guessed " + ++inputCounter + " times.");
                System.out.println("Guess the number (1-100):");
                userInput = scnr.nextInt();
            }
            else {
                System.out.println("Too high. Guess again. You've guessed " + ++inputCounter + " times.");
                System.out.println("Guess the number (1-100):");
                userInput = scnr.nextInt();
            }
        }

        System.out.println("You guessed it!  It took you " + ++inputCounter + " guesses.");
    }
}
