class PrimeCalculator {

    public int nth(int n) {

        if (n < 1) throw new IllegalArgumentException();

        int count = 1;
        int candidate = 2;
        while (count < n) {
            candidate++;
            boolean isPrime = true;
            for (int factor = 2; factor * factor <= candidate; factor++) {
                if (candidate % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }

        return candidate;
    }
}
