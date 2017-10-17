import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Matrix {

    private final Set<MatrixCoordinate> saddlePoints = new HashSet<MatrixCoordinate>();

    public Matrix(List<List<Integer>> matrix) {

        if (matrix.size() == 0) return;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {

                boolean minRow = true;
                boolean maxCol = true;

                for (int x = 0; x < matrix.size(); x++) {
                    if (x != i && matrix.get(x).get(j) < matrix.get(i).get(j))
                        minRow = false;
                }
                for (int y = 0; y < matrix.get(i).size(); y++) {
                    if (y != j && matrix.get(i).get(y) > matrix.get(i).get(j))
                        maxCol = false;
                }

                if (minRow && maxCol)
                    saddlePoints.add(new MatrixCoordinate(i, j));
            }
        }
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;
    }
}
