import java.util.Scanner;

public class wordInWord {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // command line input from user
        System.out.println("Type the first word: ");
        String wordOne = reader.nextLine();
        System.out.println("Type the second word: ");
        String wordTwo = reader.nextLine();

        int index = wordOne.indexOf(wordTwo);

        if (index == -1) System.out
                .println("The word '" + wordTwo + "' is not found in the word '" + wordOne + "' .");
        else System.out
                .println("The word '" + wordTwo + "' is found in the word '" + wordOne + "' .");

    } // close main
} // close class
