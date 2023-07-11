

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<archive> list = new ArrayList<>();

        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }     

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }  

            archive item = new archive(id, name);

            if (list.contains(item)) {
                System.out.println("Repeated");
            } else {
                list.add(item);
            }
        }

        System.out.println("==Items==");

        for (archive i : list) {
            System.out.println(i.getIdentifier() + ": " + i.getName());
        }

    }
}
