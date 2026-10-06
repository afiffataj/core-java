class HondaBike {
    static String brand = "Honda";
    static String fuelType = "Petrol";
    static double engineCapacity = 160.0d;
    static int mileage = 45;
    static String countryOfOrigin = "Japan";

    public static void main(String[] args) {
        String color = "Red";
        int discount = 15;
        double weight = 140.5d;
        long productNo = 8901234567l;
        String genericName = "Honda Unicorn";

        System.out.println(HondaBike.brand);
        System.out.println(HondaBike.fuelType);
        System.out.println(HondaBike.engineCapacity);
        System.out.println(HondaBike.mileage);
        System.out.println(HondaBike.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		HondaBike.canWeUse();
		HondaBike.doesItHaveGoodMileage();
		HondaBike.isItComfortable();
		HondaBike.isItHeavy();
		HondaBike.isItEasyToHandle();
    }

    static void canWeUse() {
        System.out.println("Yes we can use HondaBike");
    }

    static void doesItHaveGoodMileage() {
        System.out.println("Yes it has good mileage");
    }

    static void isItComfortable() {
        System.out.println("Yes it is comfortable");
    }

    static void isItHeavy() {
        System.out.println("No it is not very heavy");
    }

    static void isItEasyToHandle() {
        System.out.println("Yes it is easy to handle");
    }
}