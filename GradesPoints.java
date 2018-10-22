import java.util.Scanner;

public class GradesPoints {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // input score
        System.out.println("Type the points [0-60]: ");
        double points = Double.parseDouble(reader.nextLine());

        // compute grade
        if (points >= 50 && points <= 60) System.out.println("Grade: " + 5);
        else if (points >= 45 && points <= 49) System.out.println("Grade: " + 4);
        else if (points >= 40 && points <= 44) System.out.println("Grade: " + 3);
        else if (points >= 35 && points <= 39) System.out.println("Grade: " + 2);
        else if (points >= 30 && points <= 34) System.out.println("Grade: " + 1);
        else if (points >= 0 && points <= 29) System.out.println("Grade: failed");
        else System.out.println("Please enter a valid score.");

    } // close main
} // close class
