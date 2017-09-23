import java.util.Arrays;

class Matrix {

    private int[][] matrix;

    public Matrix(String matrixAsString) {
        matrix = Arrays.stream(matrixAsString.split("\\n"))
                       .map(row -> Arrays.stream(row.split(" ")).mapToInt(Integer::parseInt).toArray())
                       .toArray(int[][]::new);
    }

    public int getRowsCount() {
        return matrix.length;
    }

    public int getColumnsCount() {
        return matrix.length > 0 ? matrix[0].length : 0;
    }

    public int[] getRow(int i) {
        return matrix[i];
    }

    public int[] getColumn(int i) {
        return Arrays.stream(matrix)
                     .mapToInt(row -> row[i])
                     .toArray();
    }
}
