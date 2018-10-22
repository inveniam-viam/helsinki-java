import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // while-true block
        while (true) {
            // reading input temperature
            System.out.println("Enter a temperature: ");
            double temperature = Double.parseDouble(reader.nextLine());

            // checking temperature range
            if (temperature > -30 && temperature < 40) {
                Graph.addNumber(temperature);
            } // close if block
        } // close while
    } // close main
} // close class
