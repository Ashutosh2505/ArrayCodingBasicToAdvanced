import java.util.HashSet;
import java.util.Set;

public class Q45 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }
        Set<Integer> set = new HashSet<>(set1);
        set.addAll(set2);
        set1.retainAll(set2);// Retain only common elements in set1
        set.removeAll(set2); // Remove common elements from the result
        System.out.println(set);

    }

}
