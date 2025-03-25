public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {1,0,0};
        boolean canJump = canJump(nums);
        System.out.println(canJump); // Output: true
    }
    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length -2; i >= 0; i--) {
            if(i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
