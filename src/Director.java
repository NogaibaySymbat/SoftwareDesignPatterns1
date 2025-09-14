public class Director {
    public Car constructSportsCar(CarBuilder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Turbo");
        builder.setGPS(true);
        builder.setTripComputer(true);
        return builder.build();
    }

    public Car constructCityCar(CarBuilder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("Hybrid");
        builder.setGPS(false);
        builder.setTripComputer(true);
        return builder.build();
    }
}
