import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int n) {
        int sum = IntStream.rangeClosed(1, n).sum();
        return sum * sum;
    }

    int computeSumOfSquaresTo(int n) {
        return IntStream.rangeClosed(1, n).map(x -> x * x).sum();
    }

    int computeDifferenceOfSquares(int n) {
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }

}
