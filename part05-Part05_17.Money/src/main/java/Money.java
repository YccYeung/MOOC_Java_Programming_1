
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        return (100 * this.euros + this.cents) < (100 * compared.euros + compared.cents);

    }

    public Money minus(Money decreaser) {

        int euro = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;

        if (cent < 0) {
            cent = 100 - Math.abs(cent);
            euro = euro - 1;
        }

        if (euro < 0) {
            euro = 0;
            cent = 0;
        }

        Money newMoney = new Money(euro, cent);
        
        return newMoney;
    }
}


