
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String name = String.valueOf(scanner.nextLine());

        String output = name + name+ name;
        System.out.println(output);
    }
}
