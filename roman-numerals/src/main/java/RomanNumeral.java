class RomanNumeral {

    private static final int[] ARABIC= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private final String roman;

    public RomanNumeral(int arabic) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ARABIC.length; i++) {
            while(arabic >= ARABIC[i]) {
                sb.append(ROMAN[i]);
                arabic -= ARABIC[i];
            }
        }
        roman = sb.toString();
    }

    public String getRomanNumeral() {
        return roman;
    }
}
