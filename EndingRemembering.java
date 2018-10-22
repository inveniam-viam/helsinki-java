import java.util.Scanner;

public class EndingRemembering {
    public static void main(String[] args) {
        // set up reader
        Scanner reader = new Scanner(System.in);
        // set up sum helper variable
        int sum = 0;
        // set up count variable
        int count = 0;
        // set up mean variable
        double average;
        // set up even counts
        int evenCount = 0;
        // set up odd counts
        int oddCount = 0;

        System.out.println("Type numbers: ");

        // while-true block
        while (true) {

            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) break;
            sum += number;
            count += 1;
            if (number % 2 == 0) evenCount += 1;
            else oddCount += 1;


        } // close while loop
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (1.0 * sum) / count);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    } // close main
} // close class
