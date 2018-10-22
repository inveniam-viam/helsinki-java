public class manyGreet {

    public static void main(String[] args) {

        greetManyTimes("Jessica", 3);
        System.out.println("and");
        greetManyTimes("Min Choi", 2);

    } // close main

    public static void greet(String name) {

        System.out.println("Hi " + name + ", greetings from the world of methods!");

    } // close greet

    public static void greetManyTimes(String name, int times) {

        // loop variable
        int i = 0;
        while (i < times) {
            greet(name);
            i++; // increment loop variable

        } // close while

    } // close greetManyTimes

} // close class
