import java.util.Arrays;

public class Q17 {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
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
        System.out.println("Initial Array : " + Arrays.toString(arr));

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        int[] oddElements = new int[oddCount];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddElements[index++] = arr[i];
            }
        }
        reverseArray(oddElements);

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = oddElements[index++];
            }
        }
        System.out.println("Reverse Array :" + Arrays.toString(arr));
    }
}
