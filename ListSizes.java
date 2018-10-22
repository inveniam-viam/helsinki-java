import java.util.ArrayList;

public class ListSizes {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");

        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the strings: " + lengths);

    } // end main method

    public static ArrayList<Integer> lengths(ArrayList<String> list) {

        ArrayList<Integer> lengthList = new ArrayList<Integer>();

        for (String values : list) {
            lengthList.add(values.length());
        }

        return lengthList;


    } // end lengths method

}
