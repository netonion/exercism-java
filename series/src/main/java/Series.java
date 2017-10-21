import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Series {

    private List<Integer> digits;

    public Series(String series) {
        digits = series.chars()
            .map(Character::getNumericValue).boxed()
            .collect(Collectors.toList());
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public List<List<Integer>> slices(int n) {
        if (n > digits.size())
            throw new IllegalArgumentException();

        return IntStream.rangeClosed(0, digits.size() - n)
            .mapToObj(i -> digits.subList(i, i + n))
            .collect(Collectors.toList());
    }
}
