

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int n = removeDuplicates(nums);
        System.out.println(n);
    }
    
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (var i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i -1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
