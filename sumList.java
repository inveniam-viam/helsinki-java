import java.util.ArrayList;

public class sumList {

    public static void main(String[] args) {

        // initializing a new list
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        int sumOfList = sum(list);

        System.out.println("The sum: " + sumOfList);

        list.add(10);

        System.out.println("The sum: " + sum(list));


    } // end main

    public static int sum(ArrayList<Integer> list) {

        // container variable to hold the sum
        int sumNumbers = 0;

        for (int values : list) {
            sumNumbers += values;
        }

        return sumNumbers;

    } // end sum method
}
