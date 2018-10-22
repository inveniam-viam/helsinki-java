import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class alphaList {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // initializing array
        ArrayList<String> words = new ArrayList<String>();

        while (true) {

            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) break;

            words.add(word);

        }

        Collections.sort(words);

        System.out.println("You typed the following words: ");

        for (String content : words) {
            System.out.println(content);
        }

    } // end main

} // end class
