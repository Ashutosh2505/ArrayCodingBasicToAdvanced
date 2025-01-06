public class Q33 {
    public static void main(String[] args) {
        int[] elements = { 10, 21, 30, 40, 50, 90, 100, 70, 88 };
        // 0 1 2 3 4 5 6
        // length = 9

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0 && elements[i] > max) {

                max = elements[i];
            }
        }

        System.out.println(max);
        System.out.println("done");
    }
}