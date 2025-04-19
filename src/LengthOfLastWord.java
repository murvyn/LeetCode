public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int length = lengthOfLastWord(s);
        System.out.println(length); // Output: 5
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}