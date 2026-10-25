class Cinema {
    public static void main(String[] args) {

        System.out.println("Is cinema open");
        Cinema.isCinemaOpen();
        Cinema.isCinemaOpen();
        Cinema.isCinemaOpen();

        System.out.println("Is online booking available");
        Cinema.isOnlineBookingAvailable();
        Cinema.isOnlineBookingAvailable();
        Cinema.isOnlineBookingAvailable();

        System.out.println("Is 3D screening available");
        Cinema.is3DScreeningAvailable();
        Cinema.is3DScreeningAvailable();
        Cinema.is3DScreeningAvailable();

        System.out.println("Is food available");
        Cinema.isFoodAvailable();
        Cinema.isFoodAvailable();
        Cinema.isFoodAvailable();

        System.out.println("Cinema name");
        System.out.println(Cinema.getCinemaName());
        System.out.println(Cinema.getCinemaName());
        System.out.println(Cinema.getCinemaName());

        System.out.println("Ticket price");
        System.out.println(Cinema.getTicketPrice());
        System.out.println(Cinema.getTicketPrice());
        System.out.println(Cinema.getTicketPrice());

        System.out.println("Number of screens");
        System.out.println(Cinema.getNumberOfScreens());
        System.out.println(Cinema.getNumberOfScreens());
        System.out.println(Cinema.getNumberOfScreens());

        System.out.println("Cinema location");
        System.out.println(Cinema.getCinemaLocation());
        System.out.println(Cinema.getCinemaLocation());
        System.out.println(Cinema.getCinemaLocation());
    }

    static void isCinemaOpen() {
        System.out.println("Yes, the cinema is open");
    }

    static void isOnlineBookingAvailable() {
        System.out.println("Yes, online booking is available");
    }

    static void is3DScreeningAvailable() {
        System.out.println("Yes, 3D screening is available");
    }

    static void isFoodAvailable() {
        System.out.println("Yes, food is available");
    }

    static String getCinemaName() {
        return "Silver Screen Cinema";
    }

    static int getTicketPrice() {
        return 200;
    }

    static int getNumberOfScreens() {
        return 6;
    }

    static String getCinemaLocation() {
        return "Mangaluru";
    }
}