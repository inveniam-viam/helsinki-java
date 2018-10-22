import java.util.Scanner;

public class UpToCertain {
    public static void main(String[] args) {
        // setting up scanner
        Scanner read = new Scanner(System.in);
        // read limit number
        System.out.println("Up to what number?");
        int limit = Integer.parseInt(read.nextLine());
        // set initial number
        int number = 1;
        while (number <= limit) {
            System.out.println(number);
            number++;
        } // close while

    } // close main
} // close class
