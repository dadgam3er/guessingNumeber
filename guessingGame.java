import java.util.Random;
import java.util.Scanner;

public class guessingGame{
    public static void main(String[] args) {
        int numberOfGuesses = 0;
        int userGuess = 0;
        System.out.println("######################################################");
        System.out.println("##########     Let's play a guessing game    #########");
        System.out.println("######################################################\n\n");
        boolean win = false;
        Random rand = new Random();
        int RandNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your guess (1 -99) here: ");
        while(!win){
            userGuess = scanner.nextInt();
            if (numberOfGuesses < 7){
                if (userGuess == RandNumber){
                    System.out.println("You won! Congratulations!");
                    scanner.close();
                    win = true;
                } else if (userGuess > RandNumber) {
                    System.out.println("Your guess is hight, try lower!");
                } else {
                    System.out.println("Your guess is low, try higher!");
                }
            } else if (numberOfGuesses >= 7){
                if (userGuess == RandNumber) {
                    System.out.println("You got that right, Phew!");
                } else {
                    System.out.println("You lose! the number is: " + RandNumber + " Better luck next time!");
                }
            }
            numberOfGuesses++;
        }
    }
}