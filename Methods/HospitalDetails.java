class HospitalDetails {
    public static void main(String[] args) {

        System.out.println("The hospital details");

        String name = "City Hospital";
        int rooms = 150;
        double fees = 500.50;
        boolean emergency = true;

        HospitalDetails.display(name, rooms, fees, emergency);
    }

    static String display(String a, int b, double c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}