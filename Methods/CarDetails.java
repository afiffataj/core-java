class CarDetails {
    public static void main(String[] args) {

        System.out.println("The car details");

        String brand = "Toyota";
        int speed = 120;
        float mileage = 18.5f;
        boolean automatic = true;

        CarDetails.display(brand, speed, mileage, automatic);
    }

    static String display(String a, int b, float c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}