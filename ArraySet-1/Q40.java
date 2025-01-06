public class Q40 {
    public static void main(String[] args) {
        int[] elements = { 4, 8, 10, 21, 31, 40, 50, 99, 100, 70, 88 };

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 != 0 && elements[i] < min1) {
                min2 = min1;
                min1 = elements[i];
            } else if (elements[i] < min2 && elements[i] > min1) {
                min2 = elements[i];
            }
        }

        System.out.println(min2);
    }
}
