class RefrigeratorShopping {
    public static void main(String[] args) {

        System.out.println("the price of refrigerator");
        long price = RefrigeratorShopping.refrigeratorPrice();
        System.out.println(price);

        System.out.println("the brand of refrigerator");
        System.out.println(RefrigeratorShopping.refrigeratorBrand());

        System.out.println("the quantity of refrigerator");
        byte quantity = RefrigeratorShopping.refrigeratorQuantity();
        System.out.println(quantity);

        System.out.println("the weight of refrigerator");
        double weight = RefrigeratorShopping.refrigeratorWeight();
        System.out.println(weight);

        System.out.println("the capacity of refrigerator");
        float capacity = RefrigeratorShopping.refrigeratorCapacity();
        System.out.println(capacity);

        System.out.println("is refrigerator frost free");
        boolean frostFree = RefrigeratorShopping.refrigeratorFrostFree();
        System.out.println(frostFree);

        System.out.println("the refrigerator color code");
        char color = RefrigeratorShopping.refrigeratorColor();
        System.out.println(color);
    }

    static long refrigeratorPrice() {
        long price = 42000L;
        return price;
    }

    static String refrigeratorBrand() {
        String brand = "Whirlpool";
        return brand;
    }

    static byte refrigeratorQuantity() {
        byte quantity = 2;
        return quantity;
    }

    static double refrigeratorWeight() {
        double weight = 58.5d;
        return weight;
    }

    static float refrigeratorCapacity() {
        float capacity = 340.0f;
        return capacity;
    }

    static boolean refrigeratorFrostFree() {
        boolean frostFree = true;
        return frostFree;
    }

    static char refrigeratorColor() {
        char color = 'S';
        return color;
    }
}