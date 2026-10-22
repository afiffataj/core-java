class CinemaBooking {
    public static void main(String[] args) {

        System.out.println("Cinema Booking Details");

        double ticketPrice = 180.50;
        double ticketPrice1 = 250.75;

        CinemaBooking.printTicketPrices(ticketPrice, ticketPrice1);
        CinemaBooking.printMovieNames("Avatar", "Inception");
    }

    static void printTicketPrices(double a, double b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printMovieNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}