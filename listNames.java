import java.util.ArrayList;
import java.util.Scanner;

public class listNames {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // initializing array
        ArrayList<String> words = new ArrayList<String>();

        // code to add the words to the arraylist
        while (true) {

            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) break;

            words.add(word);

        }

        System.out.println("You typed the following words: ");
        // for-each loop to output the words entered
        for (String content : words) {

            System.out.println(content);
        }

    } // close main

} // close class
