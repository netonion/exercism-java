class PascalsTriangleGenerator {

    int[][] generateTriangle(int n) {

        if (n < 0) throw new IllegalArgumentException();

        int[][] res = new int[n][];
        for (int i = 0; i < n; i++) {
            res[i] = new int[i + 1];
            res[i][0] = 1;
            for (int j = 1; j < i; j++) {
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
            res[i][i] = 1;
        }

        return res;
    }
}
