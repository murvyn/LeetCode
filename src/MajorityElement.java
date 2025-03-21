import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int majority = majorityElement(nums);
        System.out.println(majority);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> majority = new HashMap<>();
        int n = nums.length;
        for (var item : nums) {
            majority.put(item, majority.getOrDefault(item, 0) + 1);
            if (majority.get(item) > n / 2) {
                return item;
            }
        }
        return -1; // No majority element found
    }
}