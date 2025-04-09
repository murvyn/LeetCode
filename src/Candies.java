
import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {

    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] respectToLeft = new int[n];
        int[] respectToRight = new int[n];
        int candies = 0;

        Arrays.fill(respectToLeft, 1);
        Arrays.fill(respectToRight, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                respectToLeft[i] = respectToLeft[i - 1] + 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                respectToRight[i] = respectToRight[i + 1] + 1;
        }

        for (int i = 0; i < n; i++) {
            candies = candies + Math.max(respectToLeft[i], respectToRight[i]);
        }

        return candies;
    }
}
