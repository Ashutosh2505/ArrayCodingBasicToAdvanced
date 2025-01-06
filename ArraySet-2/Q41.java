
import java.util.Arrays;

public class Q41 {
    public static void main(String[] args) {
        int[] elements = { 4, 3, 5, 8, 7 };
        //
        System.out.println("initial: " + Arrays.toString(elements));
        Arrays.sort(elements);
        System.out.println("after sorting: " + Arrays.toString(elements));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int elementSum = 0;
        // imp logic
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            if (elements[i] > max) {
                max = elements[i];
            }
            elementSum += elements[i];
        }
        // imp formula
        int n = max - min + 1;
        int naturalsum = (n * (2 * min + (n - 1))) / 2;
        int missedElement = naturalsum - elementSum;
        System.out.println("missed Elements:" + missedElement);

    }
}