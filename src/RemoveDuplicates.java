
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,1,2,3,3 };
        int n = removeDuplicates(nums);
        System.out.println(n);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[k] && count < 2) {
                count++;
                k++;
                nums[k] = nums[i];
            } else if(nums[i] != nums[k]){
                count = 1;
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k + 1);
        return 0;
    }
}
