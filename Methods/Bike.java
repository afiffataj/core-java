class Bike {
    public static void main(String[] args) {
        System.out.println("Is the bike price available");

        int priceOfBike = 50000;
        int priceOfBike1 = 65000;

        Bike.isTheBikePriceAvailable(priceOfBike, priceOfBike1);
    }

    static void isTheBikePriceAvailable(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}