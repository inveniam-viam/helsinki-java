public class LyyraCard {

    private double balance;

    public LyyraCard(double startingBalance) {
        this.balance = startingBalance;

    } // end constructor initialization

    public String toString() {
        return "The card has " + this.balance + " euros.";

    } // end toString method

    public void payEconomical() {

        // if statement included to see if the account has
        // enough money to make the transaction go through
        if (this.balance > 2.50) {
            this.balance -= 2.50;
        }

    } // end payEconomical method

    public void payGourmet() {

        if (this.balance > 4.0) {
            this.balance -= 4.0;
        }


    } // end payGourmet method

    public void loadMoney(double amount) {

        if (amount > 0) {
            this.balance += amount;
        }


        if (this.balance > 150) {
            this.balance = 150;
        } // truncating to card max. limits
    }


    public static void main(String[] args) {


        // initializing cards for Pekka and Brian
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // Pekka buys gourmet lunch
        cardPekka.payGourmet();

        // Brian buys economical lunch
        cardBrian.payEconomical();

        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        // Pekka loads 20 euros
        cardPekka.loadMoney(20);

        // Brian buys gourmet lunch
        cardBrian.payGourmet();

        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        // Pekka buys economical lunch twice
        cardPekka.payEconomical();
        cardPekka.payEconomical();

        // Brian loads 50 euros
        cardBrian.loadMoney(50);

        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);


    } // end main

} // end class LyyraCard
