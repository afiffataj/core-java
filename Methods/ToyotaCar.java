class ToyotaCar {
    static String brand = "Toyota";
    static String fuelType = "Petrol";
    static double engineCapacity = 2.0d;
    static int seatingCapacity = 5;
    static String countryOfOrigin = "Japan";

    public static void main(String[] args) {
        String color = "White";
        int discount = 10;
        double weight = 1450.5d;
        long productNo = 6789012345l;
        String genericName = "Toyota Camry";

        System.out.println(ToyotaCar.brand);
        System.out.println(ToyotaCar.fuelType);
        System.out.println(ToyotaCar.engineCapacity);
        System.out.println(ToyotaCar.seatingCapacity);
        System.out.println(ToyotaCar.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		ToyotaCar.canWeUse();
		ToyotaCar.doesItHaveGoodMileage();
		ToyotaCar.isItComfortable();
		ToyotaCar.isItAutomatic();
		ToyotaCar.isItEasyToDrive();
    }

    static void canWeUse() {
        System.out.println("Yes we can use ToyotaCar");
    }

    static void doesItHaveGoodMileage() {
        System.out.println("Yes it has good mileage");
    }

    static void isItComfortable() {
        System.out.println("Yes it is comfortable");
    }

    static void isItAutomatic() {
        System.out.println("Yes it is available with automatic transmission");
    }

    static void isItEasyToDrive() {
        System.out.println("Yes it is easy to drive");
    }
}