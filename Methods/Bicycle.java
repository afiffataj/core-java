class Bicycle {
    public static void main(String[] args) {

        System.out.println("the price of bicycle");
        long price = Bicycle.bicyclePrice();
        System.out.println(price);

        System.out.println("the brand of bicycle");
        System.out.println(Bicycle.bicycleBrand());

        System.out.println("the quantity of bicycle");
        byte quantity = Bicycle.bicycleQuantity();
        System.out.println(quantity);

        System.out.println("the weight of bicycle");
        double weight = Bicycle.bicycleWeight();
        System.out.println(weight);

        System.out.println("the wheel size of bicycle");
        float wheelSize = Bicycle.bicycleWheelSize();
        System.out.println(wheelSize);

        System.out.println("is bicycle available");
        boolean available = Bicycle.bicycleAvailable();
        System.out.println(available);

        System.out.println("the bicycle color code");
        char color = Bicycle.bicycleColor();
        System.out.println(color);
    }

    static long bicyclePrice() {
        return 18000L;
    }

    static String bicycleBrand() {
        return "Hero";
    }

    static byte bicycleQuantity() {
        return 3;
    }

    static double bicycleWeight() {
        return 14.5d;
    }

    static float bicycleWheelSize() {
        return 26.0f;
    }

    static boolean bicycleAvailable() {
        return true;
    }

    static char bicycleColor() {
        return 'R';
    }
}