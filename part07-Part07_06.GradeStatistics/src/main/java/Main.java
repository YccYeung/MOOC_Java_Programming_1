
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        Grade grade = new Grade();
        UI ui = new UI(point, scanner, grade);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        ui.start();
        
    }
}
