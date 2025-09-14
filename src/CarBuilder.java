interface CarBuilder {
    void reset();
    void setSeats(int n);
    void setEngine(String e);
    void setGPS(boolean v);
    void setTripComputer(boolean v);
    Car build();
}
