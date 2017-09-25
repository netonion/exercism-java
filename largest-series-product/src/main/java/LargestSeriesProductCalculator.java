public class LargestSeriesProductCalculator {

    private int[] digits;

    public LargestSeriesProductCalculator(String number) {

        if (number == null) throw new IllegalArgumentException("String to search must be non-null.");

        digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') throw new IllegalArgumentException("String to search may only contain digits.");
            digits[i] = c - '0';
        }
    }

    public long calculateLargestProductForSeriesLength(int n) {

        if (n < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if (n > digits.length) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        long max = 0;

        for (int i = 0; i <= digits.length - n; i++) {
            long prod = 1;
            for (int j = 0; j < n; j++) {
                prod *= digits[i + j];
            }
            if (prod > max) max = prod;
        }

        return max;
    }

}
