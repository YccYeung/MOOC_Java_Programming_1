
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String word = scanner.nextLine();
            String[] split = word.split(" ");

            if (word.equals("")) {
                break;
            }

            System.out.println(split[0]);
        }
    }
}
