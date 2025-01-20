
// import java.util.Stack;

public class LongestPalindrome {

    public static void main(String[] args) throws Exception {
        // var s = "bb";
        // System.out.println(longestPalindrome(s));
    }
    
    // Brute force solution O(n^3)
    // private static boolean isPalindrome(String s) {
    // Stack<Character> stack = new Stack<>();
    // for (int i = 0; i < s.length(); i++) {
    // stack.push(s.charAt(i));
    // }
    // StringBuilder sb = new StringBuilder();
    // while (!stack.isEmpty()) {
    // sb.append(stack.pop());
    // }
    // return s.equalsIgnoreCase(sb.toString());
    // }

    // private static String longestPalindrome(String s) {
    // String longestPalindrome = "";
    // for (int i = 0; i < s.length(); i++) {
    // for (int j = 1 + i; j <= s.length(); j++) {
    // String substring = s.substring(i, j);
    // if (isPalindrome(substring) && longestPalindrome.length() <
    // substring.length()) {
    // longestPalindrome = substring;
    // }
    // }
    // }
    // return longestPalindrome;
    // }

    // Expand around middle O(n^2)
    // private static String longestPalindrome(String str) {
    //     if (str == null || str.length() == 0)
    //         return "";

    //     int start = 0;
    //     int end = 0;

    //     for (int i = 0; i < str.length(); i++) {
    //         int len1 = expandFromMiddle(str, i, i);
    //         int len2 = expandFromMiddle(str, i, i + 1);
    //         int len = Math.max(len1, len2);
    //         if (len > end - start) {
    //             start = i - (len - 1) / 2;
    //             end = i + len / 2;
    //         }

    //     }
    //     return str.substring(start, end + 1);
    // }

    // private static int expandFromMiddle(String str, int start, int end) {
    //     while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
    //         start--;
    //         end++;
    //     }
    //     return end - start - 1;
    // }
}


