class WaterBottle {
    public static void main(String[] args) {

        System.out.println("Is water bottle available?");
        WaterBottle.isWaterBottleAvailable();

        System.out.println("The brand of water bottle is");
        String brand = WaterBottle.theBrandOfWaterBottle();
        System.out.println(brand);

        System.out.println("The price of water bottle");
        int a = 250;
        WaterBottle.thePriceOfWaterBottle(a);

        System.out.println("The color of water bottle");
        String color = "Blue";
        WaterBottle.theColorOfWaterBottle(color);
    }

    static void isWaterBottleAvailable() {
        System.out.println("Yes water bottle is available");
    }

    static String theBrandOfWaterBottle() {
        String brand = "Milton";
        return brand;
    }

    static void thePriceOfWaterBottle(int a) {
        System.out.println(a);
    }

    static String theColorOfWaterBottle(String c) {
        System.out.println(c);
        return c;
    }
}