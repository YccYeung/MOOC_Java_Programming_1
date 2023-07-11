
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        int length = 0;
        int sum = 0;
        int count = 0;


        while (true) {

            String word = String.valueOf(scanner.nextLine());
            String[] split = word.split(",");

            if (word.equals("")) {
                break;
            }
            
            String name = String.valueOf(split[0]);
            int age = Integer.valueOf(split[1]);
            

            if (name.length() > length) {
                length = name.length();
                longest = name;
            }

            sum += age;
            count++;

        }

        double average = (double) sum/count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
