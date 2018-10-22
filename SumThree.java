import java.util.Scanner;

public class SumThree {
    public static void main(String[] args) {
        // setting up reader
        Scanner reader = new Scanner(System.in);

        // setting up sum variable (assume integer inputs)
        int sum = 0;

        // setting up read variable
        int read;

        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);

    } // close main
} // close class
