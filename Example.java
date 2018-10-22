import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = reader.nextLine();

        System.out.println("Hi, " + name);
    }
}
