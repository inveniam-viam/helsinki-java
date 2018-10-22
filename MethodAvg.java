public class MethodAvg {
    public static void main(String[] args) {

        double answer = average(4, 3, 6, 1);

        System.out.println("Sum: " + answer);
    } // close main

    // summing method
    public static int sum(int number1, int number2, int number3, int number4) {

        return number1 + number2 + number3 + number4;

    } // close sum method

    public static double average(int number1, int number2, int number3, int number4) {

        int summation = sum(number1, number2, number3, number4);

        return summation / 4.0;
    }
} // close class
