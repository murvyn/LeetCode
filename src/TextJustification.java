
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
        int maxWidth = 16;
        List<String> justifiedText = fullJustify(words, maxWidth);
        for (String line : justifiedText) {
            System.out.println(line);
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> results = new ArrayList<>();
        List<StringBuilder> currentWords = new ArrayList<>();
        int sumOfLengthOfCurrentWords = 0;

        for(String word : words) {
            int newLineLength = sumOfLengthOfCurrentWords + word.length() + currentWords.size();
            if(newLineLength > maxWidth) {
                int extraPadding = maxWidth - (sumOfLengthOfCurrentWords + currentWords.size() - 1);
                int wordsToRoundRobin = Math.max(currentWords.size() - 1, 1);
                for(int i = 0; i < extraPadding; i++) {
                    currentWords.get(i % wordsToRoundRobin).append(" ");
                }
                results.add(currentWords.stream().map(sb -> sb.toString()).collect(Collectors.joining(" ")));
                currentWords.clear();
                sumOfLengthOfCurrentWords = 0;
            }
            currentWords.add(new StringBuilder(word));
            sumOfLengthOfCurrentWords += word.length();

            }

            int extraSpaces = maxWidth - (sumOfLengthOfCurrentWords + currentWords.size() - 1);
            String spaces = Stream.generate(() -> " ").limit(extraSpaces).collect(Collectors.joining(""));
            results.add(currentWords.stream().map(sb -> sb.toString()).collect(Collectors.joining(" ")) + spaces);
            return results;
        }

    }

