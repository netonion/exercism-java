class CollatzCalculator {

    public int computeStepCount(int n) {

        if (n < 1) throw new IllegalArgumentException("Only natural numbers are allowed");

        int steps = 0;
        while (n > 1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            steps++;
        }

        return steps;
    }
}
