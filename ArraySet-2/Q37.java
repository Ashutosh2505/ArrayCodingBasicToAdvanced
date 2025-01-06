import java.util.Arrays;

class Q37 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 20, 120, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int index1 = 2, index2 = 6;
        int total = index2 - index1;
        for (int i = index2; i < elements.length; i++) {
            elements[i - total] = elements[i];
        }

        int[] temp = elements;
        elements = new int[temp.length - total];
        for (int i = 0; i < temp.length - total; i++) {
            elements[i] = temp[i];
        }

        System.out.println("final:" + Arrays.toString(elements));

    }
}