
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        String output = "The collection " + name + " has ";

        if (elements.size() == 1) {
            output += elements.size() + " element:" + "\n";

            for (String i : elements) {
                output += i;
            }

            return output;
        }

        output += elements.size() + " elements:" + "\n";

        for (String i : elements) {
                output += i + "\n";
            }

        return output;
    }
    
}
