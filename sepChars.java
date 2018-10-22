import java.util.Scanner;

public class sepChars {

    public static void main(String[] args) {

        // set up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        // helper variable
        int i = 0;

        while (i < name.length()) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++; // incrementing loop variable
        }

    } // close main

} // close class
