import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (sum, difference or quit): ");
            String command = reader.nextLine();
            if (command.equals("quit")) break;

            System.out.println("Enter the numbers");
            int first = Integer.parseInt(reader.nextLine());
            int second = Integer.parseInt(reader.nextLine());

            if (command.equals("sum")) {
                int sum = first + second;
                System.out.println("The sum of the numbers is " + sum);
            } // close if
            else if (command.equals("difference")) {
                int difference = first - second;
                System.out.println("The difference of the numbers is " + difference);
            } // close else
            else System.out.println("Unknown command");
        } // close while
        System.out.println("Thanks, bye!");
    } // close main
} // close class
