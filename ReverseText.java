import java.util.Scanner;

public class ReverseText {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));

    } // close main

    public static String reverse(String text) {

        // initializing empty string to hold reversed text
        String reverseText = "";
        // initializing helper variable for a while loop
        int i = text.length() - 1;

        while (i >= 0) {
            reverseText += text.charAt(i);
            // decrement loop variable
            i--;
        }


        return reverseText;


    } // close method

} // close loop
