public class LCM {
    public static void main(String[] args) {
        System.out.println(fun(4, 6));
    }

    private static int fun(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
        // TC : O(log(min(a,b)));
    }

    // private static int fun(int a, int b) {
    // naive
    // int res = Math.max(a, b);
    // while (true) {
    // if (res % a == 0 && res % b == 0) {
    // return res;
    // }
    // res++;
    // }
    // }
}
