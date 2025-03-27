
import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        int hIndex = hIndex(citations);
        System.out.println(hIndex); // Output: 3
    }

    public static int hIndex(int[] citations) {
        int hIndex = 0;
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            hIndex = n - i;
            if(citations[i] >= hIndex) {
                return hIndex;
            }
        }
        return 0;
    }
}
