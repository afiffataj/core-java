class ProductDetails {
    public static void main(String[] args) {

        System.out.println("The product details");

        int productId = 501;
        String productName = "Laptop";
        double price = 45000.75;
        boolean inStock = true;

        ProductDetails.display(productId, productName, price, inStock);
    }

    static int display(int a, String b, double c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}