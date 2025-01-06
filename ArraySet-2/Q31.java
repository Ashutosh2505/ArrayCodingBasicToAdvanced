import java.util.Arrays;

class Q31 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int temp = elements[0];
        for (int i = 0; i < elements.length / 2; i++) {
            elements[i] = elements[i + 1];
        }
        elements[(elements.length / 2) - 1] = temp;
        System.out.println("final:" + Arrays.toString(elements));

    }
}