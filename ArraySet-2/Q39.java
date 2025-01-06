
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q39 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 20, 35, 40, 500 };
        System.out.println("initial: " + Arrays.toString(elements));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < elements.length; i += 2) {
            list.add(elements[i]);
        }
        elements = new int[list.size()];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = list.get(i);
        }
        System.out.println("final: " + Arrays.toString(elements));
    }
}