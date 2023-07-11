
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
    
    /*     Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

        }  */

        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        int second = 0;

        while (true) {


            System.out.println("First: " + container1.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String command = split[0];
            int value = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                container1.add(value);
            }

            if (command.equals("move")) {
                //container1.remove(value);
                if (value >= container1.contains())
                    value = container1.contains();
                    container1.remove(value);
                    container2.add(value);
            }

            if (command.equals("remove")) {
               container2.remove(value);
            }

            System.out.println("");
        }
    }

}
