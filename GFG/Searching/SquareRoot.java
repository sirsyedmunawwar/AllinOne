public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(fn(10));
    }

    private static int fn(int x) {
        // Eff using BS
        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int msq = mid * mid;
            if (mid == x) {
                return mid;
            } else if (msq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    // private static int fn(int x) {
    // // Naive
    // int i = 0;
    // while (i * i <= x) {
    // i++;
    // }
    // return (i - 1);
    // }
}
