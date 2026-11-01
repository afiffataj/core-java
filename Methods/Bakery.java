class Bakery {
    public static void main(String[] args) {

        System.out.println("Is Bakery Open");
        Bakery.isBakeryOpen();

        System.out.println("Is Baker Available");
        Bakery.isBakerAvailable();

        System.out.println("Cake Size");
        char size = Bakery.getCakeSize();
        System.out.println(size);

        System.out.println("Are All Cakes Available");
        boolean cakes = Bakery.areAllCakesAvailable();
        System.out.println(cakes);

        System.out.println("Bakery Name");
        Bakery.getBakeryName("Sweet Treats");

        System.out.println("Cake Prices");
        Bakery.getCakePrices(500, 800);

        System.out.println("Cake Flavours");
        Bakery.getCakeFlavours("Chocolate", "Vanilla", "Strawberry");

        System.out.println("Cake Height");
        float height = Bakery.getCakeHeight(5.5f);
        System.out.println(height);

        System.out.println("Cake Weights");
        double weight = Bakery.getCakeWeights(1.5, 2.5);
        System.out.println(weight);

        System.out.println("Order Numbers");
        int order = Bakery.getOrderNumbers(201, 202, 203);
        System.out.println(order);
    }

    static void isBakeryOpen() {
        System.out.println("Yes Bakery is Open");
    }

    static void isBakerAvailable() {
        System.out.println("Yes Baker is Available");
    }

    static char getCakeSize() {
        return 'M';
    }

    static boolean areAllCakesAvailable() {
        return false;
    }

    static void getBakeryName(String name) {
        System.out.println(name);
    }

    static void getCakePrices(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getCakeFlavours(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getCakeHeight(float height) {
        return height;
    }

    static double getCakeWeights(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getOrderNumbers(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}