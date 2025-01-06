public class Q39 {
    public static void main(String[] args) {
        int[] elements = { 4, 8, 10, 21, 31, 40, 50, 99, 100, 70, 88, 91, 90 };

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                if (elements[i] > max1) {
                    max2 = max1;
                    max1 = elements[i];
                } else if (elements[i] > max2 && elements[i] < max1) {
                    max2 = elements[i];
                }
            }

        }

        System.out.println(max2);
    }
}
