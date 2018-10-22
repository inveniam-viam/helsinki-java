import java.util.Scanner;

public class FirstLetter {

    public static void main(String[] args) {

        // set up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        char letterOne = firstCharacter(name);

        System.out.println("First Character: " + letterOne);

    } // close main

    public static char firstCharacter(String text) {

        return text.charAt(0);

    } // close firstCharacter
} // close class
