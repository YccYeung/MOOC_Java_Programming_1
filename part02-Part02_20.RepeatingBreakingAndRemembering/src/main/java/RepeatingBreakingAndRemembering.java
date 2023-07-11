
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        

        int sum = 0;
        int count = 0;
        double average = 0;
        int odd = 0;
        int even = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        while (true){

            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1){
                break;
            }

            if (num % 2 == 0) {
                even++;
                
            }else {
                odd++;
            }

            sum += num;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        average = (double) sum/count;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
