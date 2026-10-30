class Umbrella {
    public static void main(String[] args) {

        System.out.println("Is umbrella available?");
        Umbrella.isUmbrellaAvailable();

        System.out.println("The brand of umbrella is");
        String brand = Umbrella.theBrandOfUmbrella();
        System.out.println(brand);

        System.out.println("The price of umbrella");
        int a = 500;
        Umbrella.thePriceOfUmbrella(a);

        System.out.println("The color of umbrella");
        String color = "Black";
        Umbrella.theColorOfUmbrella(color);
    }

    static void isUmbrellaAvailable() {
        System.out.println("Yes umbrella is available");
    }

    static String theBrandOfUmbrella() {
        String brand = "Popy";
        return brand;
    }

    static void thePriceOfUmbrella(int a) {
        System.out.println(a);
    }

    static String theColorOfUmbrella(String c) {
        System.out.println(c);
        return c;
    }
}