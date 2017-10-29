import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    @Test
    public void testRobotIsCreatedWithCorrectInitialPosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final Robot robot = new Robot(initialGridPosition, Orientation.NORTH);

        assertEquals(robot.getGridPosition(), initialGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testRobotIsCreatedWithCorrectInitialOrientation() {
        final Orientation initialOrientation = Orientation.NORTH;
        final Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        assertEquals(robot.getOrientation(), initialOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningRightDoesNotChangePosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final Robot robot = new Robot(initialGridPosition, Orientation.NORTH);

        robot.turnRight();

        assertEquals(robot.getGridPosition(), initialGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningRightCorrectlyChangesOrientationFromNorthToEast() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.EAST;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningRightCorrectlyChangesOrientationFromEastToSouth() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.SOUTH;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningRightCorrectlyChangesOrientationFromSouthToWest() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.WEST;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningRightCorrectlyChangesOrientationFromWestToNorth() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.NORTH;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningLeftDoesNotChangePosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final Robot robot = new Robot(initialGridPosition, Orientation.NORTH);

        robot.turnLeft();

        assertEquals(robot.getGridPosition(), initialGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningLeftCorrectlyChangesOrientationFromNorthToWest() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.WEST;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningLeftCorrectlyChangesOrientationFromWestToSouth() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.SOUTH;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningLeftCorrectlyChangesOrientationFromSouthToEast() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.EAST;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testTurningLeftCorrectlyChangesOrientationFromEastToNorth() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.NORTH;

        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testAdvancingDoesNotChangeOrientation() {
        final Orientation initialOrientation = Orientation.NORTH;
        final Robot robot = new Robot(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        assertEquals(robot.getOrientation(), initialOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testAdvancingWhenFacingNorthIncreasesYCoordinateByOne() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(0, 1);

        assertEquals(robot.getGridPosition(), expectedGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testAdvancingWhenFacingSouthDecreasesYCoordinateByOne() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.SOUTH);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(0, -1);

        assertEquals(robot.getGridPosition(), expectedGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testAdvancingWhenFacingEastIncreasesXCoordinateByOne() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.EAST);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(1, 0);

        assertEquals(robot.getGridPosition(), expectedGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testAdvancingWhenFacingWestDecreasesXCoordinateByOne() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.WEST);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(-1, 0);

        assertEquals(robot.getGridPosition(), expectedGridPosition);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testInstructionsToMoveWestAndNorth() {
        final Robot robot = new Robot(new GridPosition(0, 0), Orientation.NORTH);

        robot.simulate("LAAARALA");

        final GridPosition expectedGridPosition = new GridPosition(-4, 1);
        final Orientation expectedOrientation = Orientation.WEST;

        assertEquals(robot.getGridPosition(), expectedGridPosition);
        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testInstructionsToMoveWestAndSouth() {
        final Robot robot = new Robot(new GridPosition(2, -7), Orientation.EAST);

        robot.simulate("RRAAAAALA");

        final GridPosition expectedGridPosition = new GridPosition(-3, -8);
        final Orientation expectedOrientation = Orientation.SOUTH;

        assertEquals(robot.getGridPosition(), expectedGridPosition);
        assertEquals(robot.getOrientation(), expectedOrientation);
    }

    // @Ignore("Remove to run test")
    @Test
    public void testInstructionsToMoveEastAndNorth() {
        final Robot robot = new Robot(new GridPosition(8, 4), Orientation.SOUTH);

        robot.simulate("LAAARRRALLLL");

        final GridPosition expectedGridPosition = new GridPosition(11, 5);
        final Orientation expectedOrientation = Orientation.NORTH;

        assertEquals(robot.getGridPosition(), expectedGridPosition);
        assertEquals(robot.getOrientation(), expectedOrientation);
    }

}
