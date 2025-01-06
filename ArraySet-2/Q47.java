
import java.util.Arrays;

public class Q47 {
    public static void main(String[] args) {
        int[] a1 = { 4, 3, 4, 4, 4, 5, 4, 8, 1, 8, 9, 9, 1, 9 };
        System.out.println(Arrays.toString(a1));
        for (int i = 1; i < a1.length - 1; i++) {
            if (a1[i - 1] == a1[i + 1]) {
                System.out.print(i + ",");
            }
        }

    }
}