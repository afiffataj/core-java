class Backpack {
    public static void main(String[] args) {

        System.out.println("Is backpack available?");
        Backpack.isBackpackAvailable();

        System.out.println("The brand of backpack is");
        String brand = Backpack.theBrandOfBackpack();
        System.out.println(brand);

        System.out.println("The price of backpack");
        int a = 1200;
        Backpack.thePriceOfBackpack(a);

        System.out.println("The color of backpack");
        String color = "Red";
        Backpack.theColorOfBackpack(color);
    }

    static void isBackpackAvailable() {
        System.out.println("Yes backpack is available");
    }

    static String theBrandOfBackpack() {
        String brand = "Skybags";
        return brand;
    }

    static void thePriceOfBackpack(int a) {
        System.out.println(a);
    }

    static String theColorOfBackpack(String c) {
        System.out.println(c);
        return c;
    }
}