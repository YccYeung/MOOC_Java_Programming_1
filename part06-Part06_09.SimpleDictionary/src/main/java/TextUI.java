import java.util.HashMap;
import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner; 
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {

            System.out.printf("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.printf("Word: ");
                String word = scanner.nextLine();
                System.out.printf("Translation: ");
                String meaning = scanner.nextLine();
                dict.add(word, meaning);
            }  

            if (command.equals("search")) {
                System.out.printf("To be translated: ");
                String word = scanner.nextLine();
                
                if (dict.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    String translation = dict.translate(word);
                    System.out.println("Translation: " + translation);
                }
            }

            if (!(command.equals("end") || command.equals("add") || command.equals("search"))){
                System.out.println("Unknown command");
            }
        }
    }
}
