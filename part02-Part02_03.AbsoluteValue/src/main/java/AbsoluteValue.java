
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            System.out.println(number * (-1));
        }else{
            System.out.println(number);
        }

    }
}
