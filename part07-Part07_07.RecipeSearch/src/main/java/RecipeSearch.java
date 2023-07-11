
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> recipeName = new ArrayList<>();
        ArrayList<Integer> cookTime = new ArrayList<>();
        ArrayList<String> ingredient = new ArrayList<>();

        try (Scanner scanner2 = new Scanner(Paths.get(fileName))) {

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");

            while (true) {
                
                while (scanner2.hasNextLine()) {

                    String output = scanner2.nextLine();
                    ingredient.add(output);

                    if (output.isEmpty()) { //read empty line in between recipes
                        String name = scanner2.nextLine();
                        recipeName.add(name);
                        int time = Integer.valueOf(scanner2.nextLine());
                        cookTime.add(time); 
                        continue;
                    }
                }

                recipeName.add(0, ingredient.get(0));
                int firstCookTime = Integer.valueOf(ingredient.get(1));
                cookTime.add(0, firstCookTime);
                ingredient.remove(0);
                ingredient.remove(0);

                RecipeGuide guide = new RecipeGuide(recipeName, cookTime, ingredient);


                while (true) {

                    System.out.println("Enter command:");
                    String command = scanner.nextLine();

                    if (command.equals("list")) {
                        guide.recipeList();
                    }

                    if (command.equals("find name")) {
                        System.out.println("Searched word: ");
                        String searchWord = scanner.nextLine();
                        guide.findName(searchWord);
                    }
                    
                    if (command.equals("find cooking time")) {
                        System.out.println("Max cooking time: ");
                        int max = Integer.valueOf(scanner.nextLine());
                        guide.findMaxTime(max);
                    }

                    if (command.equals("find ingredient"))
                        System.out.println("Ingredient: ");
                        String word = scanner.nextLine();
                        guide.findIngredient(word);
                    
                    if (command.equals("stop")){
                        break;
                    }

                    System.out.println("");
                }
            }   

        } catch (Exception e) {
            System.out.println("The Error is: " + e.getMessage());
        }
    }


}
