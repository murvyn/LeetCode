
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String reversed = reverseWords(s);
        System.out.println(reversed); // Output: "blue is sky the"
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static String reverseWordsStream(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                     .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                         Collections.reverse(list);
                         return String.join(" ", list);
                     }));
    }
}
