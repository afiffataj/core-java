class Chair {
    public static void main(String[] args) {
        System.out.println("Is the chair price available");

        int priceOfChair = 1200;
        int priceOfChair1 = 1800;

        Chair.isTheChairPriceAvailable(priceOfChair, priceOfChair1);
    }

    static void isTheChairPriceAvailable(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}