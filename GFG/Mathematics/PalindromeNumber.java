public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(fun(78987));
    }

    private static boolean fun(int n) {
        int ori = n;
        int ans = 0;
        while (n > 0) {
            int r = n % 10;
            n /= 10;
            ans = ans * 10 + r;
        }
        return ans == ori;

        // TC theta(d)
        // d is the no of digits in input number
    }
}
