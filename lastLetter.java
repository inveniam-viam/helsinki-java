import java.util.Scanner;

public class lastLetter {

    public static void main(String[] args) {

        // set up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        char letterLast = lastCharacter(name);
        System.out.println("Last character: " + letterLast);

    } // close main

    public static char lastCharacter(String text) {

        return text.charAt(text.length() - 1);

    } // close lastCharacter

} // close class
