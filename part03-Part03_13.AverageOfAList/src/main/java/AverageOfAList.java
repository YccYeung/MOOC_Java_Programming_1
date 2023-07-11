
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;

        while (true) {


            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }
            
            count++;
            list.add(value);

        }
        
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = (double) sum/count;
        System.out.println("Average: " + average);
    }
}
