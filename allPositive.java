import java.util.ArrayList;

public class allPositive {

    public static boolean allPos(ArrayList<Integer> list) {

        boolean noNeg = true;

        for (int values : list) {
            if (values < 0) noNeg = false;
        }

        return noNeg;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(-1);

        boolean result = allPos(numbers);

        if (result) System.out.println("All numbers are positive!");
        else System.out.println("There is at least one negative number.");
    }
}
