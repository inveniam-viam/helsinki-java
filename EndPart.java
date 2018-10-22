import java.util.Scanner;

public class EndPart {

    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        // command line input from the user
        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        String endPart = word.substring(word.length() - length);
        System.out.println("Result: " + endPart);


    }
}
