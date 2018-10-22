import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // set up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        // input number
        int number = Integer.parseInt(reader.nextLine());

        // divisibility by 2 test
        if (number % 2 == 0) System.out.println("Number " + number + " is even.");
        else System.out.println("Number " + number + " is odd.");

    } // close main
} // close class
