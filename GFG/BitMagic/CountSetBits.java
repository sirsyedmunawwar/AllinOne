public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    private static int fun(int n) {
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
        // theta(set bits in n)
    }

    // private static int fun(int n) {
    // int res = 0;
    // while (n > 0) {
    // if ((n & 1) == 1) { //res=res+(n&1)
    // res++;
    // }
    // n = n >> 1;
    // }
    // return res;
    // // theta(total bits in n)
    // }
}
