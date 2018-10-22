import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nameOne = "Jessica";
        String nameTwo = "Arvind";
        greet(nameOne, nameTwo);
    } // close main

    public static void greet(String name, String from) {
        System.out.println("Hi " + name + ", Greetings from " + from);
    }
}
