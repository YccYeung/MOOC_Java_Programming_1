
public class Statistics {

    private int count;
    private int number;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.number = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.number += number;
        this.count += 1;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.number;
    }

    public double average() {
        // write code here
        if (this.count > 0){
            return (double) this.number/this.count;
        }else {
            return 0.0;
        }
    }
}



