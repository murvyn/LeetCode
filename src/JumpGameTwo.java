public class JumpGameTwo {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        int minJumps = jump(nums);
        System.out.println(minJumps); // Output: 2
    }

    public static int jump(int[] nums) {
        int furthest = 0; 
        int jumps = 0; 
        int currentEnd = 0;
        int i = 0;

        while (i < nums.length - 1) {
            furthest = Math.max(furthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = furthest;
            }
            if(currentEnd >= nums.length - 1) {
                break;
            }
            i++;

        }
        return jumps;
    }
}