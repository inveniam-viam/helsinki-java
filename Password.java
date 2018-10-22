import java.util.Scanner;

public class Password {
    public static void main(String[] args) {


        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // while-true block
        while (true) {
            String password = "carrot";
            System.out.println("Type the password: ");
            String inputPassword = reader.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("Right!");
                break;
            }
            else System.out.println("Wrong!");
        } // close while
        System.out.println();
        System.out.println("The secret is: j ryy qbar!");
    } // close main
} // close class
