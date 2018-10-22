import java.util.Scanner;

public class Guesser {

    public static int drawNumber() {

        int randomNumber = (int) (100 * Math.random());

        return randomNumber;
    }

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // generate the random number from 0 to 100
        int numberToGuess = drawNumber();

        // helper variable to count the number of guesses
        int count = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int numberGuessed = Integer.parseInt(reader.nextLine());
            count += 1;

            if (numberToGuess > numberGuessed)
                System.out.println("The number is greater, guesses made: " + count);
            else if (numberToGuess < numberGuessed)
                System.out.println("The number is lesser, guesses made: " + count);
            else {
                break;
            } // close else block

        } // close while-true block
        System.out.println("Congratulations, your guess is correct!");
    } // close main
} // close class
