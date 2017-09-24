class Triangle {

    private final TriangleKind kind;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 + side2 <= side3 ||
            side2 + side3 <= side1 ||
            side3 + side1 <= side2) {
            throw new TriangleException();
        }

        if (side1 == side2 && side2 == side3) {
            kind = TriangleKind.EQUILATERAL;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            kind = TriangleKind.ISOSCELES;
        } else {
            kind = TriangleKind.SCALENE;
        }
    }

    TriangleKind getKind() {
        return kind;
    }

}
