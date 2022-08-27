public class JoseohusProblem {
    public static void main(String[] args) {
        System.out.println(fun(5, 3));
    }

    // in this position start with 0
    // if position start with 1 then use helper fun and return ans+1
    private static int fun(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (fun(n - 1, k) + k) % n;
        }

        // t(n)
    }
}
