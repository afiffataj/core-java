class SmartWatchShopping {
    public static void main(String[] args) {

        System.out.println("the price of smartwatch");
        long price = SmartWatchShopping.watchPrice();
        System.out.println(price);

        System.out.println("the brand of smartwatch");
        System.out.println(SmartWatchShopping.watchBrand());

        System.out.println("the quantity of smartwatch");
        byte quantity = SmartWatchShopping.watchQuantity();
        System.out.println(quantity);

        System.out.println("the weight of smartwatch");
        double weight = SmartWatchShopping.watchWeight();
        System.out.println(weight);

        System.out.println("the battery capacity of smartwatch");
        float battery = SmartWatchShopping.watchBattery();
        System.out.println(battery);

        System.out.println("is smartwatch waterproof");
        boolean waterproof = SmartWatchShopping.watchWaterproof();
        System.out.println(waterproof);

        System.out.println("the smartwatch color code");
        char color = SmartWatchShopping.watchColor();
        System.out.println(color);
    }

    static long watchPrice() {
        long price = 15000L;
        return price;
    }

    static String watchBrand() {
        String brand = "Samsung";
        return brand;
    }

    static byte watchQuantity() {
        byte quantity = 5;
        return quantity;
    }

    static double watchWeight() {
        double weight = 0.045d;
        return weight;
    }

    static float watchBattery() {
        float battery = 450.5f;
        return battery;
    }

    static boolean watchWaterproof() {
        boolean waterproof = true;
        return waterproof;
    }

    static char watchColor() {
        char color = 'B';
        return color;
    }
}