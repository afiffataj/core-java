class CeilingFan {
    public static void main(String[] args) {

        System.out.println("Is ceiling fan available?");
        CeilingFan.isCeilingFanAvailable();

        System.out.println("The brand of ceiling fan is");
        String brand = CeilingFan.theBrandOfCeilingFan();
        System.out.println(brand);

        System.out.println("The price of ceiling fan");
        int a = 3200;
        CeilingFan.thePriceOfCeilingFan(a);

        System.out.println("The color of ceiling fan");
        String color = "Brown";
        CeilingFan.theColorOfCeilingFan(color);
    }

    static void isCeilingFanAvailable() {
        System.out.println("Yes ceiling fan is available");
    }

    static String theBrandOfCeilingFan() {
        String brand = "Havells";
        return brand;
    }

    static void thePriceOfCeilingFan(int a) {
        System.out.println(a);
    }

    static String theColorOfCeilingFan(String c) {
        System.out.println(c);
        return c;
    }
}