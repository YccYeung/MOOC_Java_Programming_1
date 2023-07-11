import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= this.maxWeight) {
            list.add(item);
        } else {
            return;
        }
    }

    public void printItems() {
        for (Item i : list) {
            System.out.println(i);
        }
    }

    public int totalWeight() {

        int sum = 0;

        for (Item i : list) {
            sum += i.getWeight();
        }

        return sum;
    }

    public Item heaviestItem() {
        if (list.size() == 0) {
            return null;
        }

        Item output = list.get(0);

        for (Item i : list) {
            if (i.getWeight() > output.getWeight()) {
                output = i;
            }
        }

        return output;
    }

    public String toString() {

        if (list.size() == 0) {
            return "no items (0 kg)";
        }

        if (list.size() == 1) {
            return "1 item (" + totalWeight() + "kg)";
        }

       return list.size() + " items (" + totalWeight() + "kg)";
    }
}   
