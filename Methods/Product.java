class Product {
    public static void main(String[] args) {
        System.out.println("Is the product rating available");

        float rating = 4.5f;
        float rating1 = 3.8f;

        Product.isTheProductRatingAvailable(rating, rating1);
    }

    static void isTheProductRatingAvailable(float a, float b) {
        System.out.println(a);
        System.out.println(b);
    }
}