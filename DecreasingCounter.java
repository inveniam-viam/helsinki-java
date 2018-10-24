public class DecreasingCounter {

    private int value;
    private int initialValue;


    public DecreasingCounter(int valueAtStart) {

        this.value = valueAtStart;
        this.initialValue = valueAtStart;

    } // end DecreasingCounter constructor

    public void printValue() {

        System.out.println("value: " + this.value);

    } // end printValue method

    public void decrease() {

        if (this.value > 0) {
            this.value -= 1;
        }

    } // end decrease method

    public void reset() {
        this.value = 0;
    } // end reset method

    public void setInitial() {
        this.value = initialValue;
    }

    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();


    } // end main


}
