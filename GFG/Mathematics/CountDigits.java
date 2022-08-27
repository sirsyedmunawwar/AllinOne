public class CountDigits {
    public static void main(String[] args) {
        System.out.println(fun(121121));
    }

    private static int fun(int n) {
        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;
        }
        return res;
    }

    // TC theta(d)
    // d is the no of digits in input number
}