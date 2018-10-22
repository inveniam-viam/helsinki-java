import java.util.ArrayList;

public class variance {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + varianceMethod(list));

    } // end main

    public static int sum(ArrayList<Integer> list) {

        // helper variable to initialize sum
        int sum = 0;

        for (int values : list) {
            sum += values;
        }

        return sum;

    } // end sum

    public static double average(ArrayList<Integer> list) {

        return sum(list) / ((double) list.size());

    } // end average

    public static double varianceMethod(ArrayList<Integer> list) {

        double avg = average(list);

        double vSum = 0;

        for (int values : list) {

            vSum += values * values;

        } // end for-each loop

        double firstTerm = vSum / list.size();

        double secondTerm = avg * avg;

        return firstTerm - secondTerm;


    } // end variance method

} // end class
