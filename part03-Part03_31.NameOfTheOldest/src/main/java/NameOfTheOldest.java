
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldass = "";
        
        while (true) {
            
            String word = String.valueOf(scanner.nextLine());
            String[] split = word.split(",");

            if (word.equals("")) {
                break;
            }

            String name = String.valueOf(split[0]);
            int age = Integer.valueOf(split[1]);
            
            if (age > oldest) {
                oldest = age;
                oldass = name;
            }


        }
        System.out.println("Name of the oldest: " + oldass);
    }
}
