import java.util.ArrayList;

public class Point {
    
    private ArrayList<Integer> point;
    private ArrayList<Integer> grade;

    public Point() {
        this.point = new ArrayList<>();
        this.grade = new ArrayList<>();
    }

    public void add(int value) {
        if (value >= 0 && value <= 100) {
            this.point.add(value);
        }
    }

    public int sum() {
        int sum = 0;
        for (int i : point) {
            sum += i;
        }
        return sum;
    }

    public int participantsNumber() {
        return point.size();
    }

    public double average() {
        double average = (double) sum() / point.size();
        return average;
    }

    public int passingNumber() {
        int count = 0;
        for (int i : point) {
            if (i >= 50) {
                count++;
            }
        }
        return count;
    }

    public double passingAverage() {
        int count = 0;
        int sum = 0;
        double average = 0.0;

        for (int i : point) {

            if (i >= 50) {
                count++;
                sum += i;
            }
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = 0.0;
        }
        return average;
    }

    public double passPercentage() {

        double passPercentage = 0.0;
        passPercentage = 100.0 * passingNumber() / participantsNumber();

        return passPercentage;   
    }

}
