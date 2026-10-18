class HeadphoneShopping {
    public static void main(String[] args) {

        System.out.println("the price of headphone");
        long price = HeadphoneShopping.headphonePrice();
        System.out.println(price);

        System.out.println("the brand of headphone");
        System.out.println(HeadphoneShopping.headphoneBrand());

        System.out.println("the quantity of headphone");
        byte quantity = HeadphoneShopping.headphoneQuantity();
        System.out.println(quantity);

        System.out.println("the weight of headphone");
        double weight = HeadphoneShopping.headphoneWeight();
        System.out.println(weight);

        System.out.println("the sound quality rating");
        float rating = HeadphoneShopping.headphoneRating();
        System.out.println(rating);

        System.out.println("is headphone wireless");
        boolean wireless = HeadphoneShopping.headphoneWireless();
        System.out.println(wireless);

        System.out.println("the headphone color code");
        char color = HeadphoneShopping.headphoneColor();
        System.out.println(color);
    }

    static long headphonePrice() {
        long price = 4500L;
        return price;
    }

    static String headphoneBrand() {
        String brand = "Sony";
        return brand;
    }

    static byte headphoneQuantity() {
        byte quantity = 4;
        return quantity;
    }

    static double headphoneWeight() {
        double weight = 0.280d;
        return weight;
    }

    static float headphoneRating() {
        float rating = 4.8f;
        return rating;
    }

    static boolean headphoneWireless() {
        boolean wireless = true;
        return wireless;
    }

    static char headphoneColor() {
        char color = 'W';
        return color;
    }
}