import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Matrix {

    private final Set<MatrixCoordinate> coords = new HashSet<MatrixCoordinate>();

    /*
    Record the y indices of the max of each row and the x indices of the min
    of each column. It follows that for a saddle point, the min row and the max column
    must match, that is min_xs[max_ys[x]] == x. Runtime is O(mn).
    */
    public Matrix(List<List<Integer>> matrix) {

        if (matrix.size() == 0) return;

        int[] max_ys = new int[matrix.size()];
        int[] min_xs = new int[matrix.get(0).size()];

        for (int i = 0; i < matrix.size(); i++) {
            int max = 0;
            for (int j = 1; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) > matrix.get(i).get(max)) {
                    max = j;
                }
            }
            max_ys[i] = max;
        }

        for (int j = 0; j < matrix.get(0).size(); j++) {
            int min = 0;
            for (int i = 1; i < matrix.size(); i++) {
                if (matrix.get(i).get(j) < matrix.get(min).get(j)) {
                    min = i;
                }
            }
            min_xs[j] = min;
        }

        for (int i = 0; i < matrix.size(); i++) {
            if (min_xs[max_ys[i]] == i)
                coords.add(new MatrixCoordinate(i, max_ys[i]));
        }
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        return coords;
    }
}
