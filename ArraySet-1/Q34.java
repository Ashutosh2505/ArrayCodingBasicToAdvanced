public class Q34 {
    public static void main(String[] args) {
        int[] elements = { 10, 21, 31, 40, 50, 99, 100, 70, 88 };
        // 0 1 2 3 4 5 6
        // length = 9

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 != 0 && elements[i] < min) {

                min = elements[i];
            }
        }

        System.out.println(min);
        System.out.println("done");
    }
}