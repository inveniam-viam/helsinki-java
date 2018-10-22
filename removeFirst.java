import java.util.ArrayList;

public class removeFirst {

    public static void main(String[] args) {

        // setting up new list
        ArrayList<String> newList = new ArrayList<String>();

        newList.add("Pascal");
        newList.add("Java");
        newList.add("Python");
        newList.add("Ruby");
        newList.add("C#");

        System.out.println("The list before removing the first element: ");
        print(newList);

        removeFirstElement(newList);

        System.out.println("The list after removing the first element: ");

        print(newList);


    } // end main

    public static void print(ArrayList<String> stringList) {

        for (String content : stringList) {
            System.out.println(content);
        }

    } // end print method

    public static void removeFirstElement(ArrayList<String> stringArray) {

        stringArray.remove(0);

    }


} // end class
