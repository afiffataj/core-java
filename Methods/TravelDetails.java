class TravelDetails {
    public static void main(String[] args) {

        System.out.println("The travel details");

        String destination = "Mumbai";
        int distance = 500;
        long bookingId = 123456789L;
        boolean booked = true;

        TravelDetails.display(destination, distance, bookingId, booked);
    }

    static String display(String a, int b, long c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}