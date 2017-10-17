import java.util.ArrayList;

class PrimeCalculator {

    public int nth(int n) {

        if (n < 1) throw new IllegalArgumentException();

        ArrayList<Integer> primes = new ArrayList<Integer>();

        int candidate = 2;
        while (primes.size() < n) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (candidate % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(candidate);
            candidate++;
        }

        return primes.get(n - 1);
    }
}
