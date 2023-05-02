public enum Planet {
    MERCURY(1, 2.449, 5, null, 0),
    VENUS(2, 33, 5, MERCURY, 22.45),
    EARTH(3, 6.378, 3, VENUS, 332.1),
    MARS(4, 3.488, 7, EARTH, 88.3),
    JUPITER(5, 71.3, 2, MARS, 11.1),
    SATURN(6, 60.1, 9, JUPITER, 22.2),
    URANUS(7, 26.5, 9, SATURN, 45.123),
    NEPTUNE(8, 24.75, 1, URANUS, 65.87);

    private final int planetNumber;
    private final double planetRadius;
    private final double distanceFromSun;
    private final Planet previousPlanet;
    // private final Planet nextPlanet;
    private final double distanceFromPreviousPlanet;

    Planet(int planetNumber, double planetRadius, double distanceFromSun, Planet previousPlanet, double distanceFromPreviousPlanet) {
        this.planetNumber = planetNumber;
        this.planetRadius = planetRadius;
        this.previousPlanet = previousPlanet;
        // this.nextPlanet = nextPlanet;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        if (previousPlanet == null) {
            this.distanceFromSun = distanceFromSun;
        } else {
            this.distanceFromSun = previousPlanet.getDistanceFromSun() + distanceFromPreviousPlanet;
        }
    }

    public int getPlanetNumber() {
        return planetNumber;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public Planet getPreviousPlanet() {
        return previousPlanet;
    }

}
