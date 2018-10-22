import java.util.Scanner;

public class sepFirstThree {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int i = 0;

        if (name.length() >= 3) {

            while (i < 3) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
                i++; // increment loop variable

            } // close while loop
        }

    } // close main


} // close class
