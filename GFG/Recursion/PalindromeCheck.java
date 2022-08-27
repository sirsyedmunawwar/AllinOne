public class PalindromeCheck {
    public static void main(String[] args) {
        String s = ("abbcbba");
        int n = s.length() - 1;
        System.out.println(fun(s, 0, n));
    }

    private static boolean fun(String string, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (string.charAt(start) == string.charAt(end) && fun(string, start + 1, end - 1));
    }
    // T(n)
    // T(n)
}
