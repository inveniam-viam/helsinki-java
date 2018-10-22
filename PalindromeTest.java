import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();


        if (palindrome(text)) System.out.println("The text is a palindrome!");
        else System.out.println("The text is not a palindrome!");

    } // end main

    public static String reverse(String sampleString) {

        String reverseString = "";

        // helper variable for while loop
        int i = sampleString.length() - 1;

        while (i >= 0) {
            reverseString += sampleString.charAt(i);
            i--; // decrement loop variable
        } // end while loop

        return reverseString;
    } // end reverse method

    public static boolean palindrome(String sampleString) {

        String reverseString = reverse(sampleString);

        if (sampleString.equals(reverseString)) return true;
        else return false;

    } // end palindrome checker method

}
