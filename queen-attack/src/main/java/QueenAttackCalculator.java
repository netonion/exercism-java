class BoardCoordinate {

    private int x, y;

    BoardCoordinate(int x, int y) {
        if (x < 0) throw new IllegalArgumentException("Coordinate must have positive row.");
        if (x > 7) throw new IllegalArgumentException("Coordinate must have row <= 7.");
        if (y < 0) throw new IllegalArgumentException("Coordinate must have positive column.");
        if (y > 7) throw new IllegalArgumentException("Coordinate must have column <= 7.");

        this.x = x;
        this.y = y;
    }

    boolean canReach(BoardCoordinate that) {
        int dx = this.x - that.x;
        int dy = this.y - that.y;
        return dx == 0 || dy == 0 || dx == -dy || dx == dy;
    }

    boolean equals(BoardCoordinate that) {
        return this.x == that.x && this.y == that.y;
    }
}

class QueenAttackCalculator {

    private BoardCoordinate white, black;

    public QueenAttackCalculator(BoardCoordinate white, BoardCoordinate black) {
        if (white == null || black == null)
            throw new IllegalArgumentException("You must supply valid board coordinates for both Queens.");
        if (white.equals(black))
            throw new IllegalArgumentException("Queens may not occupy the same board coordinate.");
        this.white = white;
        this.black = black;
    }

    public boolean canQueensAttackOneAnother() {
        return white.canReach(black);
    }
}
