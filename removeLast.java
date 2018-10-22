import java.util.ArrayList;

public class removeLast {

    public static void main(String[] args) {

        // initialize new list
        ArrayList<String> languages = new ArrayList<String>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("Ruby");
        languages.add("Pascal");

        System.out.println("The list prior to removing the last element: ");
        print(languages);

        // make method call
        removeLastElement(languages);

        System.out.println("The list after removing the last element: ");
        print(languages);


    } // end main

    public static void print(ArrayList<String> list) {

        for (String element : list) {
            System.out.println(element);
        }
    } // end print method

    public static void removeLastElement(ArrayList<String> list) {

        list.remove(list.size() - 1);


    } // end removeLastElement
}
