import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Matrix {

    private final Set<MatrixCoordinate> saddlePoints = new HashSet<MatrixCoordinate>();

    /*
    Record the max of each row and the min
    of each column and compare with each element. Runtime is O(mn)
    */
    public Matrix(List<List<Integer>> matrix) {

        if (matrix.isEmpty()) return;

        int m = matrix.size();
        int n = matrix.get(0).size();

        int[] maxinums = new int[m];
        int[] mininums = new int[n];

        for (int i = 0; i < m; i++) {
            int max = matrix.get(i).get(0);
            for (int j = 1; j < n; j++) {
                int val = matrix.get(i).get(j);
                if (val > max) max = val;
            }
            maxinums[i] = max;
        }

        for (int j = 0; j < n; j++) {
            int min = matrix.get(0).get(j);
            for (int i = 1; i < m; i++) {
                int val = matrix.get(i).get(j);
                if (val < min) min = val;
            }
            mininums[j] = min;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maxinums[i] == mininums[j])
                    saddlePoints.add(new MatrixCoordinate(i, j));
            }
        }
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;
    }
}
