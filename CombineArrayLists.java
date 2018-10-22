import java.util.ArrayList;

public class CombineArrayLists {

    public static void main(String[] args) {

        // initializing lists list1 and list2
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // adding elements to list1 and list2
        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);

    } // end main

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {

        for (int values : second) {
            first.add(values);
        }

    } // end combine method

} // end class
