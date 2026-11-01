class SuperMarket {
    public static void main(String[] args) {

        System.out.println("Is SuperMarket Open");
        SuperMarket.isSuperMarketOpen();

        System.out.println("Is Cashier Available");
        SuperMarket.isCashierAvailable();

        System.out.println("Product Grade");
        char grade = SuperMarket.getProductGrade();
        System.out.println(grade);

        System.out.println("Are All Products Available");
        boolean products = SuperMarket.areAllProductsAvailable();
        System.out.println(products);

        System.out.println("SuperMarket Name");
        SuperMarket.getSuperMarketName("Fresh Mart");

        System.out.println("Product Prices");
        SuperMarket.getProductPrices(100, 200);

        System.out.println("Product Names");
        SuperMarket.getProductNames("Rice", "Sugar", "Wheat");

        System.out.println("Product Quantity");
        float quantity = SuperMarket.getProductQuantity(5.5f);
        System.out.println(quantity);

        System.out.println("Product Weights");
        double weight = SuperMarket.getProductWeights(10.5, 20.5);
        System.out.println(weight);

        System.out.println("Product Codes");
        int code = SuperMarket.getProductCodes(111, 222, 333);
        System.out.println(code);
    }

    static void isSuperMarketOpen() {
        System.out.println("Yes SuperMarket is Open");
    }

    static void isCashierAvailable() {
        System.out.println("Yes Cashier is Available");
    }

    static char getProductGrade() {
        return 'A';
    }

    static boolean areAllProductsAvailable() {
        return true;
    }

    static void getSuperMarketName(String name) {
        System.out.println(name);
    }

    static void getProductPrices(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getProductNames(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getProductQuantity(float quantity) {
        return quantity;
    }

    static double getProductWeights(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getProductCodes(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}