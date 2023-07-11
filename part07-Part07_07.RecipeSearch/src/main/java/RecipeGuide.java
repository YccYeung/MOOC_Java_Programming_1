import java.util.ArrayList;

public class RecipeGuide {
    
    private ArrayList<String> name;
    private ArrayList<Integer> time;
    private ArrayList<String> food;
 
    public RecipeGuide(ArrayList<String> name, ArrayList<Integer> time, ArrayList<String> food) {
        this.name = name;
        this.time = time;
        this.food = food;
    }

    public void recipeList() {
        System.out.println("Recipes:");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + ", cooking time: " + time.get(i));
        }
    }

    public void findName(String word) {
        System.out.println("Recipes:");
        for (int i = 0; i < name.size();  i++) {
            if (name.get(i).contains(word)) {
                System.out.println(name.get(i) + ", cooking time: " + time.get(i));
            }
        }
    }

    public void findMaxTime(int max) {
        System.out.println("Recipes:");
        for (int i = 0; i < time.size(); i++) {
            if (time.get(i) <= max) {
                System.out.println(name.get(i) + ", cooking time: " + time.get(i));
            }
        }
    }

    public void findIngredient(String word) {

        String temp = "";
        for (String i : this.food) { 
            temp += i + " ";
        }

        String[] split = temp.split("  ");
        String[] wordSplit = temp.split(" ");

        System.out.println("Recipes:");

        for (int i = 0; i < name.size(); i++) {
           for (int j = 0; j < wordSplit.length; j++) {
            if (split[i].contains(word)) {
                if (wordSplit[j].equals(word)) {
                    System.out.println(name.get(i) + ", cooking time: " + time.get(i));
                }
           }
           }
        }
    }

    public void ingredientPrint() {
        for (String i : this.food) {
            System.out.printf(i + " ");
        }
    }

    public void cookTimePrint() {
        for (int i : this.time) {
            System.out.println(i);
        }
    }

}
 