
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        boolean larger = true;

        if (this.squares > compared.squares) {
            larger = true;
        } else if (this.squares <= compared.squares) {
            larger = false;
        } else if  (this.rooms > compared.rooms) {
            larger = true;
        } else {
            larger = false;
        }

       return larger;
    }

    public int priceDifference(Apartment compared) {

        int diff = (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        if (diff < 0) {
            diff = diff - diff * 2;
        }
        return diff;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        
        if ((this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares)) {
            return true;
        }
        
        return false; 
    }
}
