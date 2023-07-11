import java.util.Arrays;   

public class MainProgram{

    public static void main(String[] args) {

    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
    MainProgram.sort(numbers);

    }
    
    public static int smallest(int[] values) {

        int smallest = values[0];
        for (int i : values) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] values) {

        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == smallest(values)) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] values, int startIndex) {

        int index = 0;
        
        int[] range = new int[values.length - startIndex];
        
        for (int i = 0; i < range.length; i++) {
            range[i] = values[startIndex+i];
        }

        index = indexOfSmallest(range) + startIndex;

        return index;
        
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        
        int startIndex = 0;
        int swapIndex = indexOfSmallestFrom(array, startIndex);

        while (startIndex < array.length) {

            swap(array, startIndex, swapIndex);
            startIndex += 1;
            swapIndex = indexOfSmallestFrom(array, startIndex);
        
            System.out.println(Arrays.toString(array));

        }
    }
}

