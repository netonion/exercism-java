class Robot {

    private GridPosition position;
    private Orientation orientation;

    public Robot(GridPosition pos, Orientation ori) {
        position = pos;
        orientation = ori;
    }

    public GridPosition getGridPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
        }
    }

    public void turnLeft() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.WEST;
                break;
            case EAST:
                orientation = Orientation.NORTH;
                break;
            case SOUTH:
                orientation = Orientation.EAST;
                break;
            case WEST:
                orientation = Orientation.SOUTH;
                break;
        }
    }

    public void advance() {
        switch (orientation) {
            case NORTH:
                position = new GridPosition(position.x, position.y + 1);
                break;
            case EAST:
                position = new GridPosition(position.x + 1, position.y);
                break;
            case SOUTH:
                position = new GridPosition(position.x, position.y - 1);
                break;
            case WEST:
                position = new GridPosition(position.x - 1, position.y);
                break;
        }
    }

    public void simulate(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'A':
                    advance();
                    break;
            }
        }
    }
}
