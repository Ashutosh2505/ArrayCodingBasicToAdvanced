public class Q50 {
    public static void main(String[] args) {
        int[] elements = { 12, 45, 98, 56, 91, 56, 78 };

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length / 2; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        System.out.println(min);

    }

}
