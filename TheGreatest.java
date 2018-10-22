import java.util.ArrayList;

public class TheGreatest {

    public static void main(String[] args) {

        // initializing array
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));

    } // end main

    public static int greatest(ArrayList<Integer> list) {

        int maximum = list.get(0);

        for (int values : list) {

            if (values > maximum) maximum = values;

        }

        return maximum;


    }
}
