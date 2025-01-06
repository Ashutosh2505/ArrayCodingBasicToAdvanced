import java.util.Arrays;

public class Q16 {
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        System.out.println("Initial array:" + Arrays.toString(arr));
        // Extract even-indexed elements
        int n = arr.length;
        int evenCount = 0;

        // Count even indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }

        // Create an array to store even-indexed elements
        int[] evenElements = new int[evenCount];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenElements[index++] = arr[i];
            }
        }

        // Reverse the even-indexed elements
        reverseArray(evenElements);

        // Place reversed elements back to their positions
        index = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = evenElements[index++];
            }
        }
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }

}
