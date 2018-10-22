import java.util.ArrayList;

public class numItems {

    public static void main(String[] args) {

        // declaring the new arraylist
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list: ");
        System.out.println(countItems(list));

    } // end main

    public static int countItems(ArrayList<String> stringArray) {

        return stringArray.size();

    } // end countItems
} // end class
