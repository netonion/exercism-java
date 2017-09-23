class Matrix {

    private int[][] matrix;

    public Matrix(String matrixAsString) {

        String[] rows = matrixAsString.split("\\n");
        matrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(" ");
            matrix[i] = new int[cols.length];
            for (int j = 0; j < cols.length; j++) {
                matrix[i][j] = Integer.parseInt(cols[j]);
            }
        }
    }

    public int getRowsCount() {
        return matrix.length;
    }

    public int getColumnsCount() {
        return matrix.length > 0 ? matrix[0].length : 0;
    }

    public int[] getRow(int x) {
        return matrix[x];
    }

    public int[] getColumn(int x) {
        int[] col = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            col[i] = matrix[i][x];
        }
        return col;
    }
}
