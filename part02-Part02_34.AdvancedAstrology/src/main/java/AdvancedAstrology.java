
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf(" ");
        }
    }

    public static void printTriangle(int size) {
        
        int countspace = size;
        int countstar = 0;

        while (true) {
            if (countspace == 0) {
                break;
            }
            countstar++;
            countspace--;
            printSpaces(countspace);
            printStars(countstar);
        }
    }

    public static void christmasTree(int height) {
        
        int countspace = height-1;
        int countstar = 1;

        while (true) {

            if (countspace == -1){
                break;
            }

            printSpaces(countspace);
            printStars(countstar);
            countstar += 2;
            countspace -= 1; 
            
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
