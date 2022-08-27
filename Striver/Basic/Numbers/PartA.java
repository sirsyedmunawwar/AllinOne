public class PartA {
    // first 20 questions

    public static void main(String[] args) {
        // System.out.println(PalindromeorNot(121));
        // FindAllPalindromeNumbersInAgivenrange(10, 50);
        // System.out.println(primeOrNot(50));
        // PrimeNumbersInAGivenRange(10, 100);
        // System.out.println(ArmstrongNumberOrnot(1634));
        // System.out.println(PerfectNumberOrNot(28));
        // System.out.println(isEven(21));
        // System.out.println(isEvenUsingBitwise(20));
        // NumberIsPositiveOrNegative(1);
        // System.out.println(SumOfFirstNNaturalNumbers(5));
        // System.out.println(FindSumOfAPSeries(8, -2, 5));

        // System.out.println(findSumOfGPSeries(1, 0.5, 3));
        // System.out.println(GreatestOfTwoNumbers(1.124, 1.123));
        // System.out.println(GreatestOfThreeNumbers(16, 51, 15));
        // System.out.println(isALeapYearOrNot(2022));
        // System.out.println(ReverseDigitsOfaNumber(123));
        // MaximumAndMinimumDigitinaNumber(109);
        // PrintFibonacciSeriesuptoNthTerm(6);
        // System.out.println(fab(5));
        // System.out.println(FactorialOfaNumber(5));
        // System.out.println(Fact(5));
        // System.out.println(PowerOfaNumber(5, 3));

        FactorsOfaGivenNumber((125));

    }

    private static void FactorsOfaGivenNumber(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // private static int PowerOfaNumber(int n, int k) {
    // // better approach

    // int ans = 1;
    // while (k != 0) {
    // if (k % 2 == 0) {
    // n = n * n;
    // k /= 2;
    // } else {
    // ans = ans * n;
    // k--;
    // }
    // }
    // return ans;
    // }

    // private static int PowerOfaNumber(int n, int k) {
    // // int ans = pow(n, k);

    // int ans = 1;
    // for (int i = 1; i <= k; i++) {
    // ans = ans * n;
    // }
    // return ans;
    // }

    // private static int Fact(int n) {
    // if (n <= 1) {
    // return n;
    // }

    // return n * (Fact(n - 1));
    // }

    // private static int FactorialOfaNumber(int n) {
    // int fac = 1;
    // for (int i = 1; i <= n; i++) {
    // fac *= i;
    // }
    // return fac;
    // }

    // private static int fab(int n) {
    // if (n <= 1) {
    // return 1;
    // }
    // return fab(n - 1) + fab(n - 2);
    // }

    // private static void PrintFibonacciSeriesuptoNthTerm(int n) {
    // int a = 0;
    // int b = 1;
    // System.out.println(a);
    // System.out.println(b);

    // for (int i = 2; i < n; i++) {
    // int c = a + b;
    // System.out.println(c);
    // a = b;
    // b = c;
    // }

    // }

    // private static void MaximumAndMinimumDigitinaNumber(int n) {
    // int min = 9;
    // int max = 0;
    // while (n != 0) {
    // int r = n % 10;

    // // mini = Math.min(mini, d);
    // // maxi = Math.max(maxi, d);

    // if (r < min) {
    // min = r;
    // }
    // if (r > max) {
    // max = r;
    // }
    // n /= 10;
    // }
    // System.out.println("MIN " + min + " " + "MAX " + max);
    // }

    // private static int ReverseDigitsOfaNumber(int n) {
    // int rev = 0;
    // while (n != 0) {
    // int r = n % 10;
    // rev = rev * 10 + r;
    // n /= 10;
    // }
    // return rev;
    // }

    // private static boolean isALeapYearOrNot(int y) {

    // if(((year%4==0)&&(year%100!=0))||(year%400==0))
    // {
    // System.out.println("Yes");
    // }else
    // {
    // System.out.println("No");
    // }

    // if (y % 4 == 0) {
    // if (y % 100 == 0) {
    // if (y % 400 == 0) {
    // return true;
    // } else {
    // return false;
    // }
    // } else {
    // return true;
    // }
    // }
    // return false;
    // }

    // private static int GreatestOfThreeNumbers(int a, int b, int c) {
    // // return Math.max(a, Math.max(b, c));

    // if (a < b) {
    // if (b < c) {
    // return c;
    // } else {
    // return b;
    // }
    // } else {
    // if (a < c) {
    // return c;
    // } else {
    // return a;
    // }
    // }

    // }

    // private static double GreatestOfTwoNumbers(double a, double b) {
    // Math.max(a, b);

    // if (a > b) {
    // return a;
    // }
    // return b;
    // }

    // private static double findSumOfGPSeries(double a, double r, int n) {
    // // float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
    // double sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += a;
    // a = a * r;
    // }
    // return sum;
    // }

    // private static int FindSumOfAPSeries(int n, int a, int d) {
    // // float sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum += a;
    // a += d;
    // }
    // return sum;
    // }

    // private static int SumOfFirstNNaturalNumbers(int i) {
    // // return i * (i + 1) / 2;
    // // using loop
    // // using recursion
    // if (i == 0) {
    // return 0;
    // }
    // return i + SumOfFirstNNaturalNumbers(i - 1);

    // }

    // private static void NumberIsPositiveOrNegative(int i) {
    // // if (n > 0) positive else negative
    // if (i >> 31 == 0) { //31 because of binary bits
    // System.out.println("P");
    // } else {
    // System.out.println("N");
    // }
    // }

    // public static boolean isEvenUsingBitwise(int n) {
    // return ((n & 1) == 0);
    // }

    // public static boolean isEven(int n) {
    // return (n % 2 == 0);
    // }

    // private static boolean PerfectNumberOrNot(int n) {
    // int sum = 0;
    // for (int i = 1; i < n; i++) {
    // if (n % i == 0) {
    // sum += i;
    // }
    // }
    // return n == sum;
    // }

    // private static boolean ArmstrongNumberOrnot(int n) {
    // int ori = n;
    // int temp = n;
    // int arm = 0;
    // int nod = 0;
    // while (temp != 0) {
    // temp /= 10;
    // nod++;
    // }
    // while (n != 0) {
    // int r = n % 10;
    // arm += (Math.pow(r, nod));
    // n /= 10;
    // }
    // return ori == arm;
    // }

    // private static void PrimeNumbersInAGivenRange(int i, int j) {
    // for (int j2 = i; j2 < j; j2++) {
    // if (primeOrNot(j2)) {
    // System.out.print(j2 + " ");
    // }
    // }
    // }

    // private static boolean primeOrNot(int n) {
    // for (int j = 2; j < Math.sqrt(n); j++) {
    // if (n % j == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // private static void FindAllPalindromeNumbersInAgivenrange(int i, int j) {
    // for (int j2 = i; j2 < j; j2++) {
    // if (PalindromeorNot(j2)) {
    // System.out.println(j2);
    // }
    // }
    // }

    // private static boolean PalindromeorNot(int n) {
    // int ori = n;
    // int rev = 0;
    // while (n != 0) {
    // int r = n % 10;
    // rev = rev * 10 + r;
    // n /= 10;
    // }
    // return ori == rev;
    // }

}
