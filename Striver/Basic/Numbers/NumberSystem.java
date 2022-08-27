public class NumberSystem {
    public static void main(String[] args) {
        // ConvertBinarytoDecimal(1011);
        // ConvertDecimaltoBinaryNumber(15);
        // ConvertDecimaltoOctal(17);
        // ConvertOctaltoDecimal(345);
        // ConvertBinarytoOctal(1100110);
        // ConvertOctaltoBinary(345);

        ConvertdigitsNumbersToWords(7824);

    }

    private static void ConvertdigitsNumbersToWords(int n) {
        String str = Integer.toString(n);
        String[] singledigit = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };
        String[] twodigits = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "ninteen", "twelve" };
        String[] tensmultiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninty" };
        String[] tenspower = new String[] { "hundred", "thousand" };

        if (str.length() == 0) {
            System.out.println("");
            return;
        } else if (str.length() == 1) {
            System.out.println(str.charAt(0) - '0');
            return;
        }

        int len = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(singledigit[str.charAt(i) - '0'] + " ");
                    System.out.print(tenspower[len - 3] + " ");
                }
                len--;
            } else {
                if (str.charAt(i) - '0' == 1) {
                    System.out.print(twodigits[str.charAt(i + 1) - '0'] + " ");
                    return;
                } else if (str.charAt(i) - '0' != 0) {
                    System.out.print(tensmultiple[str.charAt(i) - '0'] + " ");
                    if (str.charAt(i + 1) - '0' != 0)
                        System.out.print(singledigit[str.charAt(i + 1) - '0']);
                    return;
                }
            }
        }
    }

    // private static void ConvertOctaltoBinary(int n) {
    // int dec = 0;
    // int baseB = 1;
    // while (n != 0) {
    // int r = n % 10;
    // n /= 10;
    // dec += r * baseB;
    // baseB *= 8;
    // }

    // int ans = 0;
    // int base = 1;
    // while (dec != 0) {
    // int r = dec % 2;
    // dec /= 2;
    // ans += r * base;
    // base *= 10;
    // }
    // System.out.println(ans);
    // }

    // private static void ConvertBinarytoOctal(int n) {
    // // String s = "1011";
    // // System.out.print(Integer.parseInt(s, 2));

    // int dec = 0;
    // int baseB = 1;
    // while (n != 0) {
    // int r = n % 10;
    // n /= 10;
    // dec += r * baseB;
    // baseB *= 2;
    // }

    // int ans = 0;
    // int base = 1;
    // while (dec != 0) {
    // int r = dec % 8;
    // dec /= 8;
    // ans += r * base;
    // base *= 10;
    // }
    // System.out.println(ans);

    // }

    // private static void ConvertOctaltoDecimal(int n) {
    // int ans = 0;
    // int base = 1;
    // while (n != 0) {
    // int r = n % 10;
    // n /= 10;
    // ans += r * base;
    // base *= 8;
    // }
    // System.out.println(ans);
    // }

    // private static void ConvertDecimaltoOctal(int n) {
    // int ans = 0;
    // int base = 1;
    // while (n != 0) {
    // int r = n % 8;
    // ans += r * base;
    // base *= 10;
    // n /= 8;
    // }
    // System.out.println(ans);
    // }

    // private static void ConvertDecimaltoBinaryNumber(int n) {
    // int ans = 0;
    // int base = 1;
    // while (n != 0) {
    // int r = n % 2;
    // ans += r * base;
    // base *= 10;
    // n /= 2;
    // }
    // System.out.println(ans);
    // }

    // private static void ConvertBinarytoDecimal(int i) {
    // // String s = "1011";
    // // System.out.print(Integer.parseInt(s, 2));

    // int ans = 0;
    // int p = 1;
    // while (i != 0) {
    // int r = i % 10;
    // i /= 10;
    // ans += r * p;
    // p *= 2;
    // }
    // System.out.println(ans);
    // }

}