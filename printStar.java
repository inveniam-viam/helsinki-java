public class printStar {

    public static void main(String[] args) {

        printXmasTree(10);

    } // close main

    public static void printStars(int number) {

        int i = 0; // loop variable initialization

        while (i < number) {
            System.out.print("*"); // print star
            i++; // increment loop variable
        } // close while

        // System.out.println(); // line break

    } // close printStars method

    public static void printSquare(int number) {

        int i = 0; // loop variable initialization

        while (i < number) {
            printStars(number); // call star printer
            i++; // increment loop variable
        }

    } // close printSquare

    public static void printRectangle(int width, int height) {

        // width loop variable initalization
        int i = 0;

        while (i < height) {

            printStars(width);
            i++;

        } // close while loop


    } // close printRectangle

    public static void printLeftTriangle(int number) {
        // prints a left aligned triangle

        // declare loop initialization variable
        int i = 1;

        while (i < number + 1) {
            printStars(i);
            i++; // loop variable increment
        }

    } // close printLeftTriangle

    public static void printWhiteSpaces(int size) {

        // initialize loop variable
        int i = 0;

        String whitespace = " ";

        while (i < size) {
            System.out.print(whitespace);

            i++; // increment loop variable
        }

    } // close printWhiteSpaces

    public static void printRightTriangle(int size) {

        // initialize loop variable
        int i = 1;

        while (i < size + 1) {

            printWhiteSpaces(size - i);
            printStars(i);
            i++;
        } // close while loop

    } // close printRightTriangle

    public static void printXmasTree(int height) {

        int i = 1;
        int j = height - 1;

        while (i < 2 * height) {

            printWhiteSpaces(j);
            printStars(i);
            printWhiteSpaces(j);

            i += 2; // increment loop variable i
            j--; // decrement loop variable j

            System.out.println();
        } // close while loop

        // now to sketch the base of the tree
        int k = 0;
        while (k < 2) {
            printWhiteSpaces(height - 2);
            printStars(3);
            printWhiteSpaces(height - 2);
            System.out.println();
            k++;
        }

    }

} // close class
