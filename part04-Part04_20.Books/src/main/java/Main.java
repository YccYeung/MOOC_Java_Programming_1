import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();

            list.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book print : list) {
                System.out.println(print.getTitle() + ", " + print.getPage() + " pages, " + print.getYear());
            }
        }else if (choice.equals("name")) {
            for (Book print : list) {
                System.out.println(print.getTitle());
            }
        }

    }
}
