class SumOfMultiples {

    private final int number;
    private final int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        int sum = 0;
        for (int n = 1; n < number; n++) {
            for (int factor : set) {
                if (n % factor == 0) {
                    sum += n;
                    break;
                }
            }
        }
        return sum;
    }

}
