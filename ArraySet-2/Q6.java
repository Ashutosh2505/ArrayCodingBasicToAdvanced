import java.util.Arrays;

class Q6 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int avg = (elements[0] + elements[elements.length - 1]) / 2;
        elements[elements.length / 2] = avg;
        System.out.println("final:" + Arrays.toString(elements));

    }
}