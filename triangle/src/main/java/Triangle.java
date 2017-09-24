import java.util.Arrays;

class Triangle {

    private final TriangleKind kind;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        double[] sides = {side1, side2, side3};
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            throw new TriangleException();
        }

        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            kind = TriangleKind.EQUILATERAL;
        } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
            kind = TriangleKind.ISOSCELES;
        } else {
            kind = TriangleKind.SCALENE;
        }
    }

    TriangleKind getKind() {
        return kind;
    }

}
