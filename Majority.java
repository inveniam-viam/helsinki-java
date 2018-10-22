import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {

        // setting age of majority variable
        int ageOfMajority = 18;

        // setting up scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        if (age >= ageOfMajority) System.out.println("You have reached the age of majority");
        else System.out.println("You have not reached the age of majority yet.");

    }
}
