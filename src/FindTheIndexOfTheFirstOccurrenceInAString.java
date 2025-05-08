public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main (String[] args) {
        int answer = strStr("sadbutsad","sad");
        System.out.println(answer);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}