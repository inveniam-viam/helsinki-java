import java.util.ArrayList;

public class averageList {

    public static void main(String[] args) {

        // declare list
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements to the list.
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));

    } // close main

    public static double sum(ArrayList<Integer> list) {

        // initialize helper variable to calculate sum
        int summation = 0;

        for (int values : list) {
            summation += values;
        }

        return (double) summation;


    } // close sum

    public static double average(ArrayList<Integer> list) {

        return sum(list) / list.size();


    } // close average method

} // close class
