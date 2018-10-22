import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));

    } // close main
} // close class
