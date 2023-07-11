import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> list;

    public Package() {
        this.list = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        list.add(gift);
    }

    public int totalWeight() {

        int sum = 0;
        
        for (Gift i : list) {
            sum += i.getWeight();
        }

        return sum;
    }

}
