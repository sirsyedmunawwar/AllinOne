public class PartB {
    public static void main(String[] args) {
        // RemoveCharactersFromFirstStringPresentInTheSecondString("abcdef", "cefz");
        // ChangeEveryLetterWithNextLexicographicAlphabet("abcdxyZ");
        // // FindTheLargestWordInAString("Google Doc");
        // WriteAProgramToSortCharactersInAString("zxcbg");
        // CountTheNumberOfWordsInAGivenString("this is a sentence");

        // ChangeCaseOfEachCharacterInAString("javA");
        // ConcatenateOneStringToAnother("Hello", "world");
        // System.out.println(FindThePositionOfASubstringWithinAString("takeuforward",
        // "forward"));
        // ReverseWordsInAString("this is an amazing program");
    }

    // private static void ReverseWordsInAString(String string) {
    // int i = 0;
    // String temp = "";
    // String ans = "";
    // while (i < string.length()) {
    // char ch = string.charAt(i);
    // if (ch != ' ') {
    // temp += ch;
    // } else if (ch == ' ') {
    // if (!ans.equals("")) {
    // ans = temp + " " + ans;
    // } else {
    // ans = temp;
    // }
    // temp = "";
    // }
    // i++;
    // }
    // if (!temp.equals("")) {
    // if (!ans.equals("")) {
    // ans = temp + " " + ans;
    // } else {
    // ans = temp;
    // }
    // }
    // System.out.println(ans);
    // }

    // private static int FindThePositionOfASubstringWithinAString(String string,
    // String string2) {
    // // int ans = string.indexOf(string2);
    // // System.out.println(ans);

    // for (int i = 0; i < string.length(); i++) {
    // int temp = i;
    // int j = 0;
    // for (j = 0; j < string2.length(); j++) {
    // if (string.charAt(temp) != string2.charAt(j)) {
    // break;
    // }
    // temp++;
    // }
    // if (j == string2.length()) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // private static void ConcatenateOneStringToAnother(String string, String
    // string2) {
    // // string = string + string2;
    // // System.out.println(string);

    // // String ans = string.concat(string2);
    // // System.out.println(ans);

    // char[] ch = string.toCharArray();
    // char[] ch1 = string2.toCharArray();
    // char[] ans = new char[string.length() + string2.length()];

    // for (int i = 0; i < ch.length; i++) {
    // ans[i] = ch[i];
    // }
    // for (int j = 0; j < ch1.length; j++) {
    // ans[j + string.length()] = ch1[j];
    // }

    // System.out.println(new String(ans));
    // }

    // private static void ChangeCaseOfEachCharacterInAString(String str) {
    // StringBuilder ans = new StringBuilder();
    // int n = str.length();
    // for (int i = 0; i < n; i++) {
    // int ascii = (int) str.charAt(i);

    // if (ascii >= 65 && ascii <= 90)
    // ans.append((char) (ascii + 32));

    // else if (ascii >= 97 && ascii <= 122)
    // ans.append((char) (ascii - 32));

    // else if (str.charAt(i) == ' ')
    // ans.append(' ');
    // }

    // System.out.println(ans.toString());
    // }

    // private static void CountTheNumberOfWordsInAGivenString(String string) {
    // int words = 1;
    // for (int i = 0; i < string.length(); i++) {
    // if (string.charAt(i) == ' ' && i != 0) {
    // words++;
    // }
    // }
    // System.out.println(words);
    // }

    // private static void WriteAProgramToSortCharactersInAString(String string) {
    // char[] arr = string.toCharArray();
    // // Arrays.sort(char_arr);

    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // char temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // String ans = new String(arr);
    // System.out.println(ans);
    // }

    // private static void FindTheLargestWordInAString(String string) {
    // String ans = "";
    // int i = 0;
    // int j = 0;
    // int end = 0;
    // int start = 0;

    // while (j <= string.length()) {
    // if (j < string.length() && string.charAt(j) != ' ') {
    // j++;
    // } else {
    // int curr = j - i;
    // if (curr > end) {
    // end = curr;
    // start = i;
    // }
    // j++;
    // i = j;
    // }
    // }
    // ans = string.substring(start, end);
    // System.out.println(ans);
    // }

    // private static void ChangeEveryLetterWithNextLexicographicAlphabet(String
    // string) {
    // StringBuffer ans = new StringBuffer();
    // for (int i = 0; i < string.length(); i++) {
    // int ascii = (int) (string.charAt(i));
    // if (ascii == 90)
    // ans.insert(i, (char) (65));

    // else if (ascii == 122)
    // ans.insert(i, (char) (97));

    // else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122))
    // ans.insert(i, (char) (ascii + 1));
    // }

    // System.out.println(ans.toString());
    // }

    // private static void
    // RemoveCharactersFromFirstStringPresentInTheSecondString(String string, String
    // string2) {
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < string.length(); i++) {
    // int flag = 0;
    // for (int j = 0; j < string2.length(); j++) {
    // if (string.charAt(i) == string2.charAt(j)) {
    // flag = 1;
    // }
    // }
    // if (flag != 1) {
    // sb.append(string.charAt(i));
    // }
    // }
    // System.out.println(sb.toString());
    // }
}
