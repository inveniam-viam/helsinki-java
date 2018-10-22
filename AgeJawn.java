import java.util.Scanner;

public class AgeJawn {
    public static void main(String[] args) {
        // set up reader
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        while (age < 5 || age > 85) {
            System.out.println("You are lying!");
            if (age < 5) System.out.println("You are so young that you cannot know how to write!");
            else if (age > 85)
                System.out.println("You are so old that you cannot know how to use a computer!");

            System.out.println("Type your age again: ");
            age = Integer.parseInt(reader.nextLine());


        } // close while
        System.out.println("Your age is " + age);
    } // close main
} // close loop
