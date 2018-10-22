import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOne {

    public static void main(String[] args) {

        // set up scanner
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        }
        else {
            System.out.println(number + " does not appear more than once.");
        }


    } // end main

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        // helper count variable;
        int count = 0;

        for (int values : list) {
            if (number == values) {
                count += 1;
            }
        }

        if (count > 1) return true;
        else return false;
    } // end moreThanOnce


}
