import java.util.Scanner;

public class reverseName {

    public static void main(String[] args) {

        // setting up reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        String nameReverse = "";

        int i = name.length() - 1;

        while (i >= 0) {

            nameReverse += name.charAt(i);

            i--; // decrement loop variable

        } // close while loop

        System.out.println("In reverse order: " + nameReverse);

    } // close main

} // close class
