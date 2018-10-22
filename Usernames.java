import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // read in username
        System.out.println("Type your username: ");
        String username = reader.nextLine();
        // read in password
        System.out.println("Type your password: ");
        String password = reader.nextLine();

        // comparison check
        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        }
        else if (username.equals("emily") && password.equals("cat")) {

            System.out.println("You are now logged into the system!");

        }
        else System.out.println("Your username or password was invalid!");
    } // close main
} // close class
