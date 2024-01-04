import java.util.Arrays;

public class Swap {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("zly indeks");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 4, 5};
        System.out.println("lista przed swap: " + Arrays.toString(myArray));

        swap(myArray, 0, 2);

        System.out.println("lista po swap: " + Arrays.toString(myArray));
    }
}
