import java.util.ArrayList;

public class Bird {
    
    private ArrayList<String> name;
    private ArrayList<String> latinName;
    private ArrayList<String> count;
    
    public Bird() {
        this.name = new ArrayList<>();
        this.latinName = new ArrayList<>();
        this.count = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        this.name.add(name);
        this.latinName.add(latinName);
    }

    public void Observation(String type) {

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).equals(type)) {
                count.add(type);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public int count(String same) {

        int temp = 0;
        for (String i : count) {
            if (i.equals(same)) {
                temp++;
            }
        }
        return temp;
    }

    public void All() {
        
        for (int i = 0; i < name.size(); i++) {
            System.out.println(this.name.get(i) + " (" + this.latinName.get(i) + "): " + count(this.name.get(i)) + " Observations");
        }
    }

    public void One(String type) {

        for (int i = 0; i < name.size(); i++) {
            if (this.name.get(i).equals(type)) {
                System.out.println(this.name.get(i) + " (" + this.latinName.get(i) + "): " + count(this.name.get(i)) + " Observations");
            }
        }
    }

}
