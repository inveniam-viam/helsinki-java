import java.util.ArrayList;
import java.util.Scanner;

public class recurringWord {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);
        // initializing new list
        ArrayList<String> words = new ArrayList<String>();

        while (true) {

            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You entered the word " + word + " twice.");
                break;
            } // end if

            words.add(word);


        } // end while

    } // close main

} // close class
