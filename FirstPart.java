import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int part = Integer.parseInt(reader.nextLine());

        String requiredPart = word.substring(0, part);

        System.out.println("Result: " + requiredPart);

    }
}
