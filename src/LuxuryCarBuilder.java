public class LuxuryCarBuilder implements CarBuilder {
    private int seats;
    private String engine;
    private boolean gps;
    private boolean tripComputer;
    private boolean massageSeats;

    @Override
    public void reset(){
        seats = 0;
        engine = null;
        gps = false;
        tripComputer = false;
        massageSeats = false;
    }

    @Override
    public void setSeats(int n) { seats = n; }
    @Override
    public void setEngine(String e) { engine = e; }
    @Override
    public void setGPS(boolean v) { gps = v; }
    @Override
    public void setTripComputer(boolean v) { tripComputer = v; }

    public void setMassageSeats(boolean v) { massageSeats = v; }

    @Override
    public Car build() {
        System.out.println("Building Luxury Car");
        return new Car(seats, engine, gps, tripComputer);
    }
}
