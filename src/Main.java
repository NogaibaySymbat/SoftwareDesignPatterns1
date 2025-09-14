public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new SimpleCarBuilder();
        Car city = director.constructCityCar(builder);
        System.out.println(city);

        LuxuryCarBuilder luxury = new LuxuryCarBuilder();
        Car premium = director.constructSportsCar(luxury);
        luxury.setMassageSeats(true);
        System.out.println(premium);
    }
}
