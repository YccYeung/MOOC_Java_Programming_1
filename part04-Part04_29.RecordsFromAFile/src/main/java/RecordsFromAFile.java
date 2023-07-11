
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = "";

        System.out.println("Name of the file:");
        String name = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(name))) {

            while (true) {
                String input = scanner2.nextLine();
                String[] split = input.split(",");

                String people = split[0];
                int number = Integer.valueOf(split[1]);

                temp = people + ", age: " + number + " ";
                if (number == 1) {
                    temp += "year";
                    System.out.println(temp);
                } else{
                    temp += "years";
                    System.out.println(temp);
                }
            }

        } catch (Exception e) {
            System.out.println("Fail to load file!");
        }

    }
}
