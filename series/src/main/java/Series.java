import java.util.List;
import java.util.ArrayList;

class Series {

    private List<Integer> digits = new ArrayList<>();

    public Series(String series) {
        for (char digit : series.toCharArray()) {
            digits.add(digit - '0');
        }
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public List<List<Integer>> slices(int n) {
        if (n > digits.size())
            throw new IllegalArgumentException();

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= digits.size() - n; i++) {
            res.add(digits.subList(i, i + n));
        }
        return res;
    }
}
