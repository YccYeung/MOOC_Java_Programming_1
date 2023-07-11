
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class IsItInTheFile {

    public static void main(String[] args) {

        boolean error = false;
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (true) {
                String input = scanner2.nextLine();
                System.out.println(input);
                list.add(input);
            }

        } catch (Exception e) {
           
        }

        if (list.isEmpty()) {
            error = true;
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        System.out.println(error);

        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        }else if (error == true) {
            System.out.println("Reading the file " + file + " failed.");
        }else {
            System.out.println("Not found.");
        }

        
        

       
            
            

        

        

        
        

        

    }
}
