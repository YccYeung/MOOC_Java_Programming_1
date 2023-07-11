import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int sum; 

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + weightTotal() <= this.maxWeight) {
            hold.add(suitcase);
        }
    }

    public int weightTotal() {
        int weight = 0;

        for (Suitcase i : hold) {
            weight += i.totalWeight();
        }

        return weight;
    }

    public void printItems() {
        for (Suitcase i : hold) {
            i.printItems();
        }
    }

    public String toString() {
        return hold.size() + " suitcases (" + weightTotal() + " kg)";
    }

}
