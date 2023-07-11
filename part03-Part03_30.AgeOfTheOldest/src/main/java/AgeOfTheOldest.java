
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            
            String word = String.valueOf(scanner.nextLine());
            String[] split = word.split(",");

            if (word.equals("")) {
                break;
            }

            int age = Integer.valueOf(split[1]);
            
            if (age > oldest) {
                oldest = age;
            }


        }
        System.out.println("Age of the oldest: " + oldest);



    }
}
