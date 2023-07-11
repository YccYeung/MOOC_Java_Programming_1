
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Bird bird = new Bird();
        
        while (true) {

            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                bird.add(name, latin);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String type = scan.nextLine();
                bird.Observation(type);
            }

            if (command.equals("All")) {
                bird.All();
            }

            if (command.equals("One")) {
                System.out.println("Bird? ");
                String type = scan.nextLine();
                bird.One(type);
            }
            
               



        }

    }

}
