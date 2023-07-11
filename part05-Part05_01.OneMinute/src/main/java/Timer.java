public class Timer {
    
    private ClockHand hundredths;
    private ClockHand sixty;

    public Timer () {
        this.sixty = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }

    public String toString () {
        return this.sixty + ":" + this.hundredths;
    }

    public void advance () {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.sixty.advance();
        }
        
    }

}
