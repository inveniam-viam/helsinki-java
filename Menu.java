import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    // initialize constructor for the class

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        // basically just adding a string to an ArrayList
        this.meals.add(meal);
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public static void main(String[] args) {
        Menu newMenu = new Menu();

        newMenu.addMeal("Hamburger");
        newMenu.addMeal("Fish 'n' Chips");
        newMenu.addMeal("Sauerkraut");

        newMenu.printMeals();

        System.out.println("trying resetting....");

        newMenu.clearMenu();
        newMenu.printMeals();


    } // end main method

}
