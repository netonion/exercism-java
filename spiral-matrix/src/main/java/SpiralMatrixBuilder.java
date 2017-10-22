class SpiralMatrixBuilder {

    public int[][] buildMatrixOfSize(int n) {
        int[][] matrix = new int[n][n];
        fillCircle(matrix, n, 0, 0, 1);
        return matrix;
    }

    /*
    It's easy to fill the 4 edges of a loop, and you can think of the matrix as one
    loop nested inside another. Couple with recursion, the solution's quite elegant.
    */
    private void fillCircle(int[][]matrix, int length, int x, int y, int num) {
        if (length == 0) return;
        if (length == 1) {
            matrix[x][y] = num;
            return;
        }
        for (int i = 0; i < length - 1; i++)
            matrix[x][y++] = num++;
        for (int i = 0; i < length - 1; i++)
            matrix[x++][y] = num++;
        for (int i = 0; i < length - 1; i++)
            matrix[x][y--] = num++;
        for (int i = 0; i < length - 1; i++)
            matrix[x--][y] = num++;

        fillCircle(matrix, length - 2, x + 1, y + 1, num);
    }
}
