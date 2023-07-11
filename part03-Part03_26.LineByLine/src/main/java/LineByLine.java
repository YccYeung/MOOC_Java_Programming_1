
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String word = scanner.nextLine();
            String[] split = word.split(" ");

            if (word.equals("")) {
                break;
            }

            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
        }
    }
    }
}
