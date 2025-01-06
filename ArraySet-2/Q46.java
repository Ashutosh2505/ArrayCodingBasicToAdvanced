import java.util.Arrays;

public class Q46 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 9 };
        int[] nums2 = { 5, 6, 7, 8 };
        int[] combinedNums = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            combinedNums[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            combinedNums[nums1.length + i] = nums2[i];
        }
        System.out.println("combinedNumber:" + Arrays.toString(combinedNums));
    }

}
