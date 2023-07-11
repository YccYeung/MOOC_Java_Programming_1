
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String storage = "";

        while (true) {
            
            String word = String.valueOf(scanner.nextLine());
            storage += word + " ";

            if (word.equals("") == true) {
                break;
            }

            String[] split = storage.split(" ");
            int last = split.length - 1;
            System.out.println(split[last]);

        }
        
    }
}

