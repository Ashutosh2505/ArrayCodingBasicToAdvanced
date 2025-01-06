public class Q36 {
    public static void main(String[] args) {
        int[] elements = { 10, 21, 31, 40, 50, 99, 100, 70, 88 };
        // 0 1 2 3 4 5 6
        // length = 9

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min1) {
                min2 = min1;
                min1 = elements[i];
            } else if (elements[i] < min2 && elements[i] > min1) {
                min2 = elements[i];
            }
        }
        System.out.println(min1);

        if (min2 != Integer.MAX_VALUE) {
            System.out.println(min2);
        } else {
            System.out.println("no 2nd min value");
        }

        System.out.println("done");
    }
}