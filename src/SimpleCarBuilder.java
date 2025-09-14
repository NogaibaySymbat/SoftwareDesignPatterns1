public class SimpleCarBuilder implements CarBuilder {
    private Car car;
    private int seats;
    private String engine;
    private boolean gps;
    private boolean tripComputer;

    @Override
    public void reset(){
        seats = 0;
        engine = null;
        gps = false;
        tripComputer = false;
    }

    @Override
    public void setSeats(int n) { seats = n; }
    @Override
    public void setEngine(String e) { engine = e; }
    @Override
    public void setGPS(boolean v) { gps = v; }
    @Override
    public void setTripComputer(boolean v) { tripComputer = v; }

    @Override
    public Car build() {
        return new Car(seats, engine, gps, tripComputer);
    }
}
