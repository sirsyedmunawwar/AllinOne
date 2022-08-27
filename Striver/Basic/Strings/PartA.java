
class PartA {
    public static void main(String[] args) {

        // System.out.println(StringisPalindromeOrNot("ABCDCBA"));
        // CountNumberOfVowelsConsonantsSpacesInString("Take u forward is Awesome");
        // FindTheASCIIValueOfCharacter('A');
        // RemoveAllVowelsFromTheString("take u forward");
        // RemoveSpacesFromAString("Take you forward");
        // RemoveCharactersFromAStringExceptAlphabets("take12% *&u ^$#forward");
        // ReverseAString("hello");
        // ReverseAStringUsingStack("hello");
        // RemoveBracketsFromAnAlgebraicExpression("a+((b-c)+d)");
        // SumOfTheNumbersInAString("123xyz1");

        // CalculateFrequencyOfCharactersInAString("takeuforward");
        // FindNonRepeatingCharactersOfAString("take u forward");
        // System.out.println(CheckIfTwoStringsAreAnagramsOfEachOther("CATB", "ACTA"));
        // MaximumOccurringCharacterInAString("takeuforwarrrd");
        // RemoveAllDuplicatesFromAString("cbacdcbc");
        // PrintAllTheDuplicatesInTheString("sinstriiintng");
    }

    // private static void PrintAllTheDuplicatesInTheString(String string) {
    // int arr[] = new int[26];
    // for (int i = 0; i < string.length(); i++) {
    // arr[string.charAt(i) - 'a']++;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > 1) {
    // System.out.println((char) (i + 'a') + " " + arr[i]);
    // }
    // }
    // }

    // private static void RemoveAllDuplicatesFromAString(String string) {
    // boolean[] map = new boolean[26];
    // String ans = "";
    // for (int i = 0; i < string.length(); i++) {
    // if (map[string.charAt(i) - 'a'] == false) {
    // ans += string.charAt(i);
    // map[string.charAt(i) - 'a'] = true;
    // }
    // }
    // System.out.println(ans);
    // }

    // private static void MaximumOccurringCharacterInAString(String string) {
    // char ans = 'a';
    // int maxFre = 0;
    // int[] frq = new int[256];
    // for (int i = 0; i < string.length(); i++) {
    // frq[string.charAt(i)]++;
    // if (frq[string.charAt(i)] > maxFre) {
    // maxFre = frq[string.charAt(i)];
    // ans = string.charAt(i);
    // }
    // }
    // System.out.println(ans);
    // }

    // private static boolean CheckIfTwoStringsAreAnagramsOfEachOther(String string,
    // String string2) {
    // if (string.length() != string2.length()) {
    // return false;
    // }
    // int[] freq = new int[26];
    // for (int i = 0; i < string.length(); i++) {
    // freq[string.charAt(i) - 'A']++;
    // }
    // for (int i = 0; i < string2.length(); i++) {
    // freq[string2.charAt(i) - 'A']--;
    // }
    // for (int i = 0; i < freq.length; i++) {
    // if (freq[i] != 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // private static void FindNonRepeatingCharactersOfAString(String string) {
    // int[] freq = new int[26];
    // for (int i = 0; i < string.length(); i++) {
    // if (string.charAt(i) == ' ') {
    // continue;
    // } else {
    // freq[string.charAt(i) - 'a']++;
    // }
    // }
    // for (int i = 0; i < freq.length; i++) {
    // if (freq[i] == 1) {
    // System.out.print((char) (i + 'a') + " ");
    // }
    // }
    // }

    // private static void CalculateFrequencyOfCharactersInAString(String string) {
    // int[] freq = new int[26];
    // for (int i = 0; i < string.length(); i++) {
    // freq[string.charAt(i) - 'a']++;
    // }
    // for (int i = 0; i < freq.length; i++) {
    // if (freq[i] != 0) {
    // System.out.print((char) (i + 'a'));
    // System.out.print(freq[i] + " ");
    // }
    // }
    // }

    // private static void SumOfTheNumbersInAString(String string) {
    // String tempsum = "0";
    // int sum = 0;
    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // if (Character.isDigit(ch)) {
    // tempsum += ch;
    // } else {
    // sum += Integer.parseInt(tempsum);
    // tempsum = "0";
    // }

    // }
    // sum = sum + Integer.parseInt(tempsum);
    // System.out.println(sum);
    // }

    // private static void RemoveBracketsFromAnAlgebraicExpression(String string) {
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // if (ch != '(' && ch != ')') {
    // sb.append(string.charAt(i));
    // }
    // }
    // System.out.println(sb.toString());
    // }

    // private static void ReverseAStringUsingStack(String string) {
    // char[] stArr = new char[string.length()];
    // Stack<Character> st = new Stack<>();
    // for (int i = 0; i < string.length(); i++) {
    // st.push(string.charAt(i));
    // }
    // int i = 0;

    // while (!st.isEmpty()) {
    // stArr[i++] = st.pop();
    // }
    // string = new String(stArr);
    // System.out.println(string);
    // }

    // private static void ReverseAString(String string) {
    // int i = 0;
    // int j = string.length() - 1;
    // while (i < j) {
    // string = swap(string, i, j);
    // i++;
    // j--;
    // }
    // System.out.println(string);
    // }

    // private static String swap(String string, int i, int j) {
    // StringBuilder str = new StringBuilder(string);
    // str.setCharAt(i, string.charAt(j));
    // str.setCharAt(j, string.charAt(i));
    // return str.toString();
    // }

    // private static void RemoveCharactersFromAStringExceptAlphabets(String string)
    // {
    // StringBuilder ans = new StringBuilder();
    // for (int i = 0; i < string.length(); i++) {
    // int asciiValue = (int) string.charAt(i);
    // if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue
    // <= 122)) {
    // ans.append(string.charAt(i));
    // }

    // }
    // System.out.println(ans);
    // }

    // private static void RemoveSpacesFromAString(String string) {
    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // if (ch == ' ') {
    // string = string.substring(0, i) + string.substring(i + 1);

    // }
    // }
    // System.out.println(string);
    // }

    // private static void RemoveAllVowelsFromTheString(String string) {
    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
    // 'A' || ch == 'E' || ch == 'I'
    // || ch == 'O' || ch == 'U') {
    // string = string.substring(0, i) + string.substring(i + 1);

    // }
    // }
    // System.out.println(string);
    // }

    // private static void FindTheASCIIValueOfCharacter(char c) {
    // int asciiValue = c;
    // System.out.println(asciiValue);
    // }

    // private static void CountNumberOfVowelsConsonantsSpacesInString(String
    // string) {
    // int vovels = 0;
    // int consonents = 0;
    // int spaces = 0;
    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
    // 'A' || ch == 'E' || ch == 'I'
    // || ch == 'O' || ch == 'U') {
    // vovels++;
    // } else if (ch == ' ') {
    // spaces++;
    // } else {
    // consonents++;
    // }
    // }
    // System.out.println("vovels = " + vovels);
    // System.out.println("consonents = " + consonents);
    // System.out.println("spaces = " + spaces);
    // }

    // private static boolean StringisPalindromeOrNot(String string) {
    // int start = 0;
    // int end = string.length() - 1;
    // while (start <= end) {
    // if (string.charAt(start) != string.charAt(end)) {
    // return false;
    // }
    // start++;
    // end--;
    // }
    // return true;
    // }
}