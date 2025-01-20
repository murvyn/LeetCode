class ZigzagConversion {
    public static void main (String[] args) throws Exception {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int increment = 2 * (numRows - 1);
        for(int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += increment) {
                sb.append(s.charAt(j));
                if(i > 0 && i < numRows - 1 && (j + increment - 2 * i < s.length())){
                    sb.append(s.charAt(j + increment - 2 * i));
                }
            }
        }
        return sb.toString();
    }
}
