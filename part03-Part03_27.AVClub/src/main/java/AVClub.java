
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String word = scanner.nextLine();
            String[] split = word.split(" ");

            if (word.equals("") == true) {
                break;
            }

            for (String value : split) {
                if (value.contains("av")) {
                    System.out.println(value);
                }
            }

        }
    }
}
