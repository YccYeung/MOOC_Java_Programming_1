public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    private double maxHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        maxHeartRate = (double) 206.3 - (0.711 * this.age);
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
        return targetHeartRate;
    }

}
