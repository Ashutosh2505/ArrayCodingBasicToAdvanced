
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q48 {
    public static void main(String[] args) {
        int[] a1 = { 4, 3, 5, 9, 4, 9, 20, 1, 5 };
        System.out.println("initial: ");
        System.out.println(Arrays.toString(a1));
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : a1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // System.out.println(map);
        List<Integer> list = new ArrayList<Integer>();
        for (int i : a1) {
            if (map.get(i) == 1 && !list.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}