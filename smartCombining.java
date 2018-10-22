import java.util.ArrayList;

public class smartCombining {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);
        list2.add(4);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);

    } // end main

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {

        for (int values : second) {

            if (!first.contains(values)) {
                first.add(values);
            }
        }

    } // end smartCombine method
}
