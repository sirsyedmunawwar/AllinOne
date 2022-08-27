public class GenerateSubsets {
    public static void main(String[] args) {
        fun("ABC", "", 0);

    }

    private static void fun(String string, String curr, int i) {
        if (i == string.length()) {
            System.out.println(curr);
            return;
        }
        fun(string, curr + string.charAt(i), i + 1);
        fun(string, curr, i + 1);
    }
}
