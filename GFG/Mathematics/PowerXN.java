public class PowerXN {
    public static void main(String[] args) {
        System.out.println(fun(3, 4));
    }

    private static int fun(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
                n--;
            } else {
                x = x * x;
                n /= 2;
                ;
            }
        }
        return res;

        // O(logn)
        // O(1)
    }

    // private static int fun(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // int temp = fun(x, n / 2);
    // temp = temp * temp;
    // if (n % 2 == 0) {
    // return temp;
    // } else {
    // return temp * x;
    // }
    // }

    // private static int fun(int x, int n) {
    // int res = 1;
    // for (int i = 0; i < n; i++) {
    // res = res * x;
    // }
    // return res;
    // }
}
