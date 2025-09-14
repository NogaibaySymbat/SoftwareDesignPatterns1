public class Car {
    private final int seats;
    private final String engine;
    private final boolean gps;
    private final boolean tripComputer;

    Car(int seats, String engine, boolean gps, boolean tripComputer) {
        this.seats = seats;
        this.engine = engine;
        this.gps = gps;
        this.tripComputer = tripComputer;
    }

    @Override
    public String toString() {
        return "Car {" +
                "seats=" + seats +
                ", engine=" + engine + '\'' +
                ", gps=" + (gps ? "yes" : "no") +
                ", tripComputer=" + tripComputer + '}';
    }
}
