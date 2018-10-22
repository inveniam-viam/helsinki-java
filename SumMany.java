import java.util.Scanner;

public class SumMany {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        // while-true block
        while (true) {

            int read = Integer.parseInt(reader.nextLine());

            if (read == 0) break;

            else sum += read;


            System.out.println("Sum now: " + sum);


        } // close while

        System.out.println("Sum in the end: " + sum);

    } // close main
} // close class
