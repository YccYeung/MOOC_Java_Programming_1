import java.util.ArrayList;

public class Grade {

    private ArrayList<Integer> grade;

    public Grade() {
        this.grade = new ArrayList<>();
    }
    
    public void add(int value) {
        if (value >= 0 && value <= 100) {
            grade.add(value);
        }
    }

    public void printGrade() {
        for (int i : grade) {
            System.out.println(i);
        }
    }

    public void pointToGrade() {
        
        for (int i = 0; i < grade.size(); i++) {

            if (grade.get(i) < 50) {
                System.out.println("failed");
                grade.set(i, 0);
            } else if (grade.get(i) < 60) {
                grade.set(i, 1);
            } else if (grade.get(i) < 70) {
                grade.set(i, 2);
            } else if (grade.get(i) < 80) {
                grade.set(i, 3);
            } else if (grade.get(i) < 90) {
                grade.set(i, 4);
            } else if (grade.get(i) <= 100) {
                grade.set(i, 5);
            }
        }
    }

    public void printStar(int gradeLevel) {

        System.out.print(gradeLevel + ": ");
        for (int i = 0; i < grade.size(); i++) {
            if (grade.get(i) == gradeLevel) {
                System.out.print("*");
            }
        }    
        System.out.println("");
    }
}

