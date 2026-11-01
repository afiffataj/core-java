class Airport {
    public static void main(String[] args) {

        System.out.println("Is Airport Open");
        Airport.isAirportOpen();

        System.out.println("Is Pilot Available");
        Airport.isPilotAvailable();

        System.out.println("Flight Category");
        char category = Airport.getFlightCategory();
        System.out.println(category);

        System.out.println("Are All Flights Available");
        boolean flights = Airport.areAllFlightsAvailable();
        System.out.println(flights);

        System.out.println("Airport Name");
        Airport.getAirportName("Kempegowda Airport");

        System.out.println("Ticket Prices");
        Airport.getTicketPrices(4500, 6500);

        System.out.println("Airline Names");
        Airport.getAirlineNames("IndiGo", "Air India", "Akasa");

        System.out.println("Runway Length");
        float length = Airport.getRunwayLength(4000.5f);
        System.out.println(length);

        System.out.println("Flight Weights");
        double weight = Airport.getFlightWeights(50000.5, 60000.5);
        System.out.println(weight);

        System.out.println("Flight Numbers");
        int number = Airport.getFlightNumbers(101, 202, 303);
        System.out.println(number);
    }

    static void isAirportOpen() {
        System.out.println("Yes Airport is Open");
    }

    static void isPilotAvailable() {
        System.out.println("Yes Pilot is Available");
    }

    static char getFlightCategory() {
        return 'D';
    }

    static boolean areAllFlightsAvailable() {
        return true;
    }

    static void getAirportName(String name) {
        System.out.println(name);
    }

    static void getTicketPrices(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getAirlineNames(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getRunwayLength(float length) {
        return length;
    }

    static double getFlightWeights(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getFlightNumbers(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}