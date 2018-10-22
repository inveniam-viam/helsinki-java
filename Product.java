public class Product {

    // initializing object variables

    private String productName;
    private double productPrice;
    private int productAmount;

    // writing the constructor
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.productName = nameAtStart;
        this.productPrice = priceAtStart;
        this.productAmount = amountAtStart;
    }

    // writing the print method
    public void printProduct() {
        System.out.println(this.productName + ", price " + this.productPrice + ", amount "
                                   + this.productAmount);
    }

}
