class VehicleDetails {
    public static void main(String[] args) {

        System.out.println("The vehicle details");

        String brand = "Honda";
        int speed = 80;
        float mileage = 45.5f;
        boolean electric = false;

        VehicleDetails.display(brand, speed, mileage, electric);
    }

    static String display(String a, int b, float c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}