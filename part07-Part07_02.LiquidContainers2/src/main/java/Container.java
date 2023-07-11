public class Container {
    
    private int volume;
   

    public Container() {
        this.volume = volume;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {

        if (amount <= 0) {
            amount = 0;
        }

        if (this.volume + amount <= 100) {
            this.volume += amount;
        } else {
            this.volume = 100;
        }
    }

    public void remove(int amount) {
       
        if (this.volume - amount >= 0) {
            this.volume -= amount;
        } else {
            this.volume = 0;
        }
    }

    public String toString() {
        return this.contains() + "/100";
    }

}
