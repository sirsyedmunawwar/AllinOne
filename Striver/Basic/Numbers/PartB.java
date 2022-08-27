public class PartB {
    public static void main(String[] args) {
        // PrintallPrimeFactorsOfThegivenNumber(999);
        // System.out.println(CheckIfaNumberIsaStrongNumberOrNot(26));
        // System.out.println(numberIsAutomorphicNumber(26));
        // System.out.println(GCDofTwoNumbers(8, 4));
        // System.out.println(LCMofTwoNumbers(24,36));
        // System.out.println(SumofDigitsofaNumber(1743));
        // System.out.println(sumOfNumbersintheGivenRange(2, 7));
        // System.out.println(CheckiftheGivenNumberHarshadNumber(379));
        // System.out.println(CheckiftheNumberisAbundantNumberorNot(21));
        // System.out.println(PermutationsInWhichNPeopleCanOccupyRseats(6, 4));

        // ProgramToAddTwoFractions(5, 2, 1, 2 );
        // ReplaceAll0sWith1sInaGivenInteger(102003);
        // System.out.println(ExpressGivenNumberasSumofTwoPrimeNumbers(74));
        // System.out.println(CalculateTheAreaOfTheCircle(5));
        // ProgramtoFindRootsOfquadraticEquation(1, 1, 1);
    }

    // private static void ProgramtoFindRootsOfquadraticEquation(int a, int b, int
    // c) {
    // int d = (b * b) - 4 * a * c;
    // double sq = Math.sqrt(Math.abs(d));

    // if (d > 0) {
    // double root1 = (double) (-b + sq) / 2 * a;
    // double root2 = (double) (-b - sq) / 2 * a;
    // System.out.println(root1 + " + " + root2);

    // } else if (d == 0) {
    // double root1 = (double) -b / 2 * a;
    // double root2 = (double) -b / 2 * a;
    // System.out.println(root1 + " + " + root2);
    // } else {

    // System.out.println(-(double) b / (2 * a) + " + i" + sq + "\n" +
    // -(double) b / (2 * a) + " - i" + sq);
    // }

    // }

    // private static double CalculateTheAreaOfTheCircle(int r) {
    // return 3.14 * r*r;
    // }

    // static boolean isPrime(int n) {
    // if (n <= 1)
    // return false;

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0)
    // return false;
    // }

    // return true;
    // }

    // static boolean ExpressGivenNumberasSumofTwoPrimeNumbers(int N) {

    // if (isPrime(N) && isPrime(N - 2))
    // return true;
    // else
    // return false;
    // }

    // private static void ReplaceAll0sWith1sInaGivenInteger(int n) {
    // int ans = 0;
    // int p = 1;
    // while (n != 0) {
    // int r = n % 10;
    // if (r != 0) {
    // ans = r * p + ans;
    // p = p * 10;
    // } else {
    // ans = 1 * p + ans;
    // p = p * 10;
    // }
    // n /= 10;
    // }
    // System.out.println(ans);
    // }

    // private static void ProgramToAddTwoFractions(int n1, int d1, int n2, int d2)
    // {
    // int gcdOfd1d2 = gcd(d1, d2);
    // int lcm = (d1 * d2) / gcdOfd1d2;
    // int d3 = lcm;

    // int tempn3 = (n1 * (d3 / d1)) + (n2 * (d3 / d2));

    // int commonFactor = gcd(tempn3, d3);
    // int n3 = tempn3 / commonFactor;
    // d3 = d3 / commonFactor;

    // System.out.println(n3 + "/" + d3);
    // }

    // private static int gcd(int d1, int d2) {
    // if (d1 == 0) {
    // return d2;
    // }
    // return gcd(d2 % d1, d1);
    // }

    // private static int PermutationsInWhichNPeopleCanOccupyRseats(int n, int r) {

    // // To permute n people in r seats we have to find the value of n!/(n-r)!.The
    // // value of 5!/(5-3)! Is 60.
    // int ans = 1;
    // for (int i = n - r + 1; i <= n; i++) {
    // ans *= i;
    // }
    // return ans;
    // }

    // private static boolean CheckiftheNumberisAbundantNumberorNot(int n) {
    // int sum = 0;
    // for (int i = 2; i <= n / 2; i++) {
    // if (n % i == 0) {
    // sum += i;
    // }
    // }
    // return sum > n;
    // }

    // private static boolean CheckiftheGivenNumberHarshadNumber(int n) {
    // int sod = SumofDigitsofaNumber(n);
    // return (n % sod == 0);
    // }

    // private static int sumOfNumbersintheGivenRange(int i, int j) {
    // // int ans = (r * (r + 1)) / 2 - ((l - 1) * (l)) / 2;

    // int sum = 0;
    // for (int k = i; k <= j; k++) {
    // sum += k;
    // }
    // return sum;
    // }

    // private static int SumofDigitsofaNumber(int n) {
    // int ans = 0;
    // while (n != 0) {
    // int rem = n % 10;
    // ans += rem;
    // n /= 10;
    // }
    // return ans;
    // }

    // private static int LCMofTwoNumbers(int i, int j) {
    // int lcm = (a * b) / gcd;
    // }

    // private static int GCDofTwoNumbers(int n1, int n2) {
    // // n1 should be greater

    // while (n1 % n2 != 0) {
    // int rem = n1 / n2;
    // n1 = n2;
    // n2 = rem;
    // }
    // return n2;
    // }

    // private static int GCDofTwoNumbers(int n1, int n2) {
    // int ans = 1;
    // for (int i = 2; i <= Math.min(n1, n2); i++) {
    // if (n1 % i == 0 && n2 % i == 0) {
    // ans = Math.max(i, ans);
    // }
    // }
    // return ans;
    // }

    // private static boolean numberIsAutomorphicNumber(int n) {
    // int sq = n * n;
    // while (n != 0) {
    // if (sq % 10 != n % 10) {
    // return false;
    // }
    // n /= 10;
    // sq /= 10;
    // }
    // return true;
    // }

    // private static boolean CheckIfaNumberIsaStrongNumberOrNot(int n) {
    // int ori = n;
    // int ans = 0;
    // while (n != 0) {
    // int r = n % 10;
    // int tempAns = 1;
    // for (int i = 1; i <= r; i++) {
    // tempAns *= i;
    // }
    // ans += tempAns;
    // n /= 10;
    // }
    // return (ori == ans);
    // }

    // private static void PrintallPrimeFactorsOfThegivenNumber(int n) {
    // int i = 2;
    // while (n != 1) {
    // if (n % i == 0) {
    // System.out.println(i);
    // n /= i;
    // } else {
    // i++;
    // }
    // }
    // }
}
