
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;


        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (true) {
                
                Integer numbers = Integer.valueOf(scanner2.nextLine());
                list.add(numbers);

            }

        } catch (Exception e) {
            System.out.println("Failed to load this file");
        }

        for (Integer i : list) {
            if (i >= lowerBound && i <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);

    }

}
 