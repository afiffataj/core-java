class Car {
    public static void main(String[] args) {
        System.out.println("Is the car price available");

        int priceOfCar = 500000;
        int priceOfCar1 = 750000;

        Car.isTheCarPriceAvailable(priceOfCar, priceOfCar1);
    }

    static void isTheCarPriceAvailable(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}