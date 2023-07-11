
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> value = new ArrayList<>();

        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            
            if (numbers == 9999) {
                break;
            }

            value.add(numbers);

        }
        System.out.println("");
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallest = value.get(0);
        int index = 0;
        for (int i = 1; i < value.size(); i++){
            if (value.get(i) < smallest){
                smallest = value.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i <= value.size()-1; i++) {
            if (value.get(i) == smallest) {
                index = i;
                System.out.println("Found at index: " + index);
            }
        }
        
    }
}
