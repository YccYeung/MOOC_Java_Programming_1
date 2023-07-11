import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private Point point;
    private Grade grade;
    
    public UI(Point point, Scanner scanner, Grade grade) {
        this.point = point;
        this.scanner = new Scanner(System.in);
        this.grade = grade;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }

            point.add(value);
            grade.add(value);
        }

        grade.pointToGrade();
        

        System.out.println("Point average (all): " + point.average());
        if (point.passingAverage() > 0.0) {
            System.out.println("Point average (passing): " + point.passingAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + point.passPercentage());
        System.out.println("Grade distribution:");
        grade.printStar(5);
        grade.printStar(4);
        grade.printStar(3);
        grade.printStar(2);
        grade.printStar(1);
        grade.printStar(0);
        
    }

}
