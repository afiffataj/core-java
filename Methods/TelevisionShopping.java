class TelevisionShopping {
    public static void main(String[] args) {

        System.out.println("the price of television");
        long price = TelevisionShopping.televisionPrice();
        System.out.println(price);

        System.out.println("the brand of television");
        System.out.println(TelevisionShopping.televisionBrand());

        System.out.println("the quantity of television");
        byte quantity = TelevisionShopping.televisionQuantity();
        System.out.println(quantity);

        System.out.println("the weight of television");
        double weight = TelevisionShopping.televisionWeight();
        System.out.println(weight);

        System.out.println("the screen size of television");
        float size = TelevisionShopping.televisionSize();
        System.out.println(size);

        System.out.println("is television smart");
        boolean smart = TelevisionShopping.televisionSmart();
        System.out.println(smart);

        System.out.println("the television color code");
        char color = TelevisionShopping.televisionColor();
        System.out.println(color);
    }

    static long televisionPrice() {
        long price = 65000L;
        return price;
    }

    static String televisionBrand() {
        String brand = "LG";
        return brand;
    }

    static byte televisionQuantity() {
        byte quantity = 2;
        return quantity;
    }

    static double televisionWeight() {
        double weight = 12.5d;
        return weight;
    }

    static float televisionSize() {
        float size = 55.0f;
        return size;
    }

    static boolean televisionSmart() {
        boolean smart = true;
        return smart;
    }

    static char televisionColor() {
        char color = 'B';
        return color;
    }
}