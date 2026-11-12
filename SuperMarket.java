class SuperMarket {
    public static void main(String[] args) {

        System.out.println("Is SuperMarket open");
        SuperMarket.isSuperMarketOpen();

        System.out.println("Is manager available");
        SuperMarket.isManagerAvailable();

        System.out.println("SuperMarket grade");
        char grade = SuperMarket.theGradeOfSuperMarket();
        System.out.println(grade);

        System.out.println("Are all products available");
        boolean available = SuperMarket.areAllProductsAvailable();
        System.out.println(available);

        System.out.println("SuperMarket name");
        String name = "Dmart";
        SuperMarket.theSuperMarketName(name);

        System.out.println("Product prices");
        SuperMarket.theProductPrices(150, 250);

        System.out.println("Product names");
        SuperMarket.theProductNames("Rice", "Sugar", "Oil");

        System.out.println("Product quantity");
        SuperMarket.theProductQuantity(25.5f);

        System.out.println("Product weights");
        SuperMarket.theProductWeights(10.5d, 5.8d);

        System.out.println("Product codes");
        SuperMarket.theProductCodes(101, 102, 103);
    }

    static void isSuperMarketOpen() {
        System.out.println("Yes, SuperMarket is open");
    }

    static void isManagerAvailable() {
        System.out.println("Yes, manager is available");
    }

    static char theGradeOfSuperMarket() {
        char grade = 'A';
        return grade;
    }

    static boolean areAllProductsAvailable() {
        boolean available = true;
        return available;
    }

    static void theSuperMarketName(String name) {
        System.out.println(name);
    }

    static void theProductPrices(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void theProductNames(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float theProductQuantity(float quantity) {
        System.out.println(quantity);
        return quantity;
    }

    static double theProductWeights(double a, double b) {
        System.out.println(a);
        System.out.println(b);
        return b;
    }

    static int theProductCodes(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return c;
    }
}
