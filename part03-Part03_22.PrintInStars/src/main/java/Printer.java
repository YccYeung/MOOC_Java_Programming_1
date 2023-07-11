
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        int count = 0;

        while (true) {

            if (count == array.length) {
                break;
            }

            //System.out.print(array[count]);
            int loop = array[count];

            for (int i = 0; i < loop; i++) {
                System.out.print("*");
            }

            System.out.println("");
            count++;

        }
    }

}
