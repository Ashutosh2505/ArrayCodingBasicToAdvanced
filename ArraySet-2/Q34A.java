import java.util.Arrays;

class Q34A {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));

        for (int i = 0; i < elements.length - 3; i++) {
        }
        int index = 3;
        int[] temp = elements;
        elements = new int[temp.length - 1];
        for (int i = 0; i < index; i++) {
            elements[i] = temp[i];
        }
        for (int i = index + 1; i < temp.length; i++) {
            elements[i - 1] = temp[i];
        }
        System.out.println("final:" + Arrays.toString(elements));

    }
}