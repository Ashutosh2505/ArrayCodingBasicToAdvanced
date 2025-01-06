
import java.util.Arrays;

public class Q38 {
    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 120, 578, 5, 120, 40, 500};
        
        // Print the initial array
        System.out.println("Initial: " + Arrays.toString(elements));

        // Calculate the size of the new array (it will contain only the elements at even indices)
        int newSize = (elements.length + 1) / 2;  // Number of elements at even indices
        int[] newElements = new int[newSize];

        // Copy elements at even indices into the new array
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 == 0) {  // Check if the index is even
                newElements[index++] = elements[i];
            }
        }

        // Print the modified array
        System.out.println("Final: " + Arrays.toString(newElements));
    }
}