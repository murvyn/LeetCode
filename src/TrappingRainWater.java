

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int waterTrapped = trap(height);
        System.out.println(waterTrapped); // Output: 6
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int waterTrapped = 0;

        for(int i = 0; i < n; i++) {
            leftMax[i] = (i == 0) ? height[i] : Math.max(leftMax[i - 1], height[i - 1]);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            rightMax[i] = (i == n - 1) ? 0 : Math.max(rightMax[i + 1], height[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]) - height[i];
            if(waterLevel > 0){
                waterTrapped += waterLevel;
            }
        }
        
        return waterTrapped;
    }
}
