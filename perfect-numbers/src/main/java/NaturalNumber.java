import java.util.stream.IntStream;

class NaturalNumber {

    private int number;

    NaturalNumber(int number) {
        if (number < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    Classification getClassification() {
        int sum = IntStream.rangeClosed(1, number / 2).filter(x -> number % x == 0).sum();
        if (sum == number) return Classification.PERFECT;
        if (sum < number) return Classification.DEFICIENT;
        return Classification.ABUNDANT;
    }

}
