import java.util.ArrayList;

class PrimeFactorsCalculator {

    public ArrayList<Long> calculatePrimeFactorsOf(long input) {
        ArrayList<Long> res = new ArrayList<>();
        for (long prime = 2; prime <= input; prime++) {
            while (input % prime == 0) {
                res.add(prime);
                input /= prime;
            }
        }
        return res;
    }
}
