import java.util.Scanner;

public class NameLength {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int lengthName = calculateCharacters(name);

        System.out.println("Number of characters: " + lengthName);
    } // close main

    public static int calculateCharacters(String text) {

        return text.length();

    } // close calculateCharacters


} // close class
