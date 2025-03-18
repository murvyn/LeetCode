
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3,2,2,3 };
        int val = 3;
        int length = removeElement(nums, val);
        System.out.println(length);
    }

    public static int removeElement(int[] nums, int val) {
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            if (nums[head] == val) {
                swap(nums, head, tail);
                tail--;
            } else {
                head++;
            }
            System.out.println(Arrays.toString(nums)); 
            System.out.println("Head: " + head + ", Tail: " + tail);
        }

        return head;
    }

    private static void swap(int[] nums, int pointer1, int pointer2) {
        var temp = nums[pointer1];
        nums[pointer1] = nums[pointer2];
        nums[pointer2] = temp;
    }
}
