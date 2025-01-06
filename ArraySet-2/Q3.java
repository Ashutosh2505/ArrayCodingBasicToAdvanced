import java.util.Arrays;

class Q3 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40 };
        System.out.println("initial:" + Arrays.toString(elements));
        elements[0] = elements[elements.length - 1];
        System.out.println("final:" + Arrays.toString(elements));

    }
}