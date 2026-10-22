class AirportControl {
    public static void main(String[] args) {

        System.out.println("Airport Details");

        int airportId = 101;
        int airportId1 = 102;

        AirportControl.printAirportIds(airportId, airportId1);
        AirportControl.printAirportNames("Kempegowda", "Heathrow");
    }

    static void printAirportIds(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printAirportNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}