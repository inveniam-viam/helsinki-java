import java.util.ArrayList;

public class arrayListWhile {

    public static void main(String[] args) {

        // create list
        ArrayList<String> familyGroup = new ArrayList<String>();

        familyGroup.add("Arvind");
        familyGroup.add("Eddie");
        familyGroup.add("Justin");

        // now print all of the contents in the ArrayList

        // initialize helper variable for the while loop
        int i = 0;

        while (i < familyGroup.size()) {
            System.out.println(familyGroup.get(i));
            i++;
        }

    } // close main
} // close class
