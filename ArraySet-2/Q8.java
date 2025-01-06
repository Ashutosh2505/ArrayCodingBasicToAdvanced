import java.util.Arrays;

class Q8 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int temp = elements[0];
        elements[0] = elements[elements.length - 1];
        elements[elements.length - 1] = temp;
        System.out.println("final:" + Arrays.toString(elements));

    }
}