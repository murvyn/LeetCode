
public class PalindromeNumber {
    public static void main(String[] args) throws Exception {
        int x = 10;
        String string = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        System.out.println(sb.toString());
        if (!isValidInteger(sb.toString())) {
            System.out.println(false);
            return;
        }
        int result = Integer.parseInt(sb.toString());
        System.out.println(result == x);
    }

    public static boolean isValidInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
