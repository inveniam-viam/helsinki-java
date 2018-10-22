import java.util.Scanner;

public class manyPrints {
    public static void main(String[] args) {

        // setting up scanner
        Scanner reader = new Scanner(System.in);
        // set up limit variable
        System.out.println("How many? ");
        int limit = Integer.parseInt(reader.nextLine());
        // set up helper variable i
        int i = 0;

        while (i < limit) {
            printText();
            i++;
        } // close while

        System.out.println();


    }

    public static void printText() {
        System.out.println("In the beginning were the swamp, the hoe and Java.");

    }
}
