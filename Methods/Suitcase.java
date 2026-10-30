class Suitcase {
    public static void main(String[] args) {

        System.out.println("Is suitcase available?");
        Suitcase.isSuitcaseAvailable();

        System.out.println("The brand of suitcase is");
        String brand = Suitcase.theBrandOfSuitcase();
        System.out.println(brand);

        System.out.println("The price of suitcase");
        int a = 4500;
        Suitcase.thePriceOfSuitcase(a);

        System.out.println("The color of suitcase");
        String color = "Brown";
        Suitcase.theColorOfSuitcase(color);
    }

    static void isSuitcaseAvailable() {
        System.out.println("Yes suitcase is available");
    }

    static String theBrandOfSuitcase() {
        String brand = "VIP";
        return brand;
    }

    static void thePriceOfSuitcase(int a) {
        System.out.println(a);
    }

    static String theColorOfSuitcase(String c) {
        System.out.println(c);
        return c;
    }
}