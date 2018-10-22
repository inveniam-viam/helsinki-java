import java.util.Scanner;

public class NameAndGreeting {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Hello there, what is your name?");
        String name = reader.nextLine();
        System.out.println("What is your age? ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println(name + " is " + age + " years old!");

    } // close main
} // close class
