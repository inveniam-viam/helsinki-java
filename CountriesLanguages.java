import java.util.ArrayList;

public class CountriesLanguages {

    public static void main(String[] args) {

        // setting up prog lang list
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Python");
        programmingLanguages.add("Java");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        // setting up the countries list
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Finland");
        countries.add("Sweden");
        countries.add("Norway");


        print(programmingLanguages);

        print(countries);


    } // end main

    public static void print(ArrayList<String> printed) {

        for (String word : printed) {
            System.out.println(word);
        }

    } // end print fn

} // end class
