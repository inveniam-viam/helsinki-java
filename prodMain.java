public class prodMain {

    public static void main(String[] args) {

        // creating objects of the Product class
        Product banana = new Product("Banana", 1.1, 13);
        Product juul = new Product("Juul", 47.5, 15);

        // calling print method on the objects created
        banana.printProduct();
        juul.printProduct();

    } // end main
} // end class prodMain
