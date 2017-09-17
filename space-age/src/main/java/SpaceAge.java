enum Planet {
    MERCURY (0.2408467),
    VENUS (0.61519726),
    EARTH (1.0),
    MARS (1.8808158),
    JUPITER (11.862615),
    SATURN (29.447498),
    URANUS (84.016846),
    NEPTUNE (164.79132);

    private final static double SECONDS_IN_YEAR  = 31_557_600;
    private final double ratio;

    Planet(double ratio) {
        this.ratio = ratio;
    }

    double toSpaceAge(double seconds) {
        return seconds / SECONDS_IN_YEAR / ratio;
    }
}

class SpaceAge {

    private final double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return Planet.EARTH.toSpaceAge(seconds);
    }

    double onMercury() {
        return Planet.MERCURY.toSpaceAge(seconds);
    }

    double onVenus() {
        return Planet.VENUS.toSpaceAge(seconds);
    }

    double onMars() {
        return Planet.MARS.toSpaceAge(seconds);
    }

    double onJupiter() {
        return Planet.JUPITER.toSpaceAge(seconds);
    }

    double onSaturn() {
        return Planet.SATURN.toSpaceAge(seconds);
    }

    double onUranus() {
        return Planet.URANUS.toSpaceAge(seconds);
    }

    double onNeptune() {
        return Planet.NEPTUNE.toSpaceAge(seconds);
    }

}
