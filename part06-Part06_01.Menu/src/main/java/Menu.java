
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String i : meals) {
            System.out.println(i);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
