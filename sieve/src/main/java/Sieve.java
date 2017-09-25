import java.util.List;
import java.util.ArrayList;

class Sieve {

    private final int max;

    Sieve(int maxPrime) {
        max = maxPrime;
    }

    List<Integer> getPrimes() {

        List<Integer> primes = new ArrayList<Integer>();
        boolean[] isComposite = new boolean[max + 1];

        for (int i = 2; i <= max; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i + i; j <= max; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return primes;
    }
}
