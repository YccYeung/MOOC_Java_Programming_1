
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {


            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String command = split[0];
            int value = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                if (value < 0) {
                    System.out.println("");
                    continue;
                }
                if (first + value <= 100) {
                    first += value;   
                } else {
                    first = 100;
                }
                System.out.println("");
            }

            if (command.equals("move")) {
                
                if (value <= 100 && first >= value) {
                    second += value;
                    if (second > 100) {
                        second = 100;
                    }
                    first -= value;
                } else if (value > first && value <= 100){
                    second += first;
                    first = 0;
                } else {
                    second = 100;
                    first = 0;
                }
                System.out.println("");
                
            }

            if (command.equals("remove")) {
                if (second >= value) {
                    second -= value;
                } else {
                    second = 0;
                }

                System.out.println("");
                    
            }

        }
    }

}
