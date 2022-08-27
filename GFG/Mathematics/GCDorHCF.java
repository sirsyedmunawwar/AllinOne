public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(fun(4, 6));
    }

    private static int fun(int a, int b) {
        // optimized
        // a%b gives a if a<b
        if (b == 0) {
            return a;
        } else {
            return fun(b, a % b);
        }

        // TC : big O log(min(a,b));
    }

    // private static int fun(int a, int b) {
    // // Euclidean algorith
    // // let b be smaller than a
    // // gcd(a,b)=gc(a-b,b)

    // while (a != b) {
    // if (a > b) {
    // a = a - b;
    // } else {
    // b = b - a;
    // }
    // }
    // return a;
    // }

    // private static int fun(int a, int b) {
    // //naive
    // int res = Math.max(a, b);
    // while (res > 0) {
    // if (a % res == 0 && b % res == 0) {
    // break;
    // }
    // res--;
    // }
    // return res;

    // // TC O(min(a,b))
    // }
}
