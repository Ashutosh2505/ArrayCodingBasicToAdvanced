import java.util.Arrays;

class Q36 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 20, 120, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));

        int element = 120;
        int total = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                rightShift(elements, i);
                total++;
            }
        }

        int[] temp = elements;
        elements = new int[temp.length - total];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = temp[i + total];
        }
        System.out.println("final:" + Arrays.toString(elements));

    }

    private static void rightShift(int[] elements, int index) {
        for (int i = index; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
    }
}