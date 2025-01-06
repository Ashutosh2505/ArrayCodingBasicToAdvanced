import java.util.Arrays;

class Q35A {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int index = 3;
        int newElement = 8000;
        elements[index] = newElement;
        System.out.println("final:" + Arrays.toString(elements));

    }
}