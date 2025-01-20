public class StringToInteger {
    public static void main(String[] args) throws Exception {
        var s = "-91283472332";
        int intMax = 2147483647, intMin = -2147483648, sign = 1;
        int i = 0, n = s.length(), results = 0;
        
        while (i < n && s.charAt(i) ==' ') {
            i++;
        }
        
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if(results > ((intMax - digit) / 10) ){
                System.out.println(sign == 1 ? intMax : intMin);
            }
            results = results * 10 + digit;
            i++;
        }
        results *= sign;
        System.out.println(results);

    }
}