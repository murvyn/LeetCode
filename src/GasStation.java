public class GasStation {
    public static void main(String[] args) {

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int position = 0;
        int total = 0;

        for(var i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {
                sum = 0;
                position = i + 1;
            }
        }
        return total >= 0 ? position :  -1;
    }
}
