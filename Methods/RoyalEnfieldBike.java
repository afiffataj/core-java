class RoyalEnfieldBike {
    static String brand = "Royal Enfield";
    static String fuelType = "Petrol";
    static double engineCapacity = 350.0d;
    static int mileage = 35;
    static String countryOfOrigin = "India";

    public static void main(String[] args) {
        String color = "Black";
        int discount = 12;
        double weight = 195.0d;
        long productNo = 2345678901l;
        String genericName = "Royal Enfield Classic 350";

        System.out.println(RoyalEnfieldBike.brand);
        System.out.println(RoyalEnfieldBike.fuelType);
        System.out.println(RoyalEnfieldBike.engineCapacity);
        System.out.println(RoyalEnfieldBike.mileage);
        System.out.println(RoyalEnfieldBike.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		RoyalEnfieldBike.canWeUse();
		RoyalEnfieldBike.doesItHaveGoodMileage();
		RoyalEnfieldBike.isItPowerful();
		RoyalEnfieldBike.isItLightWeight();
		RoyalEnfieldBike.isItEasyToHandle();
    }

    static void canWeUse() {
        System.out.println("Yes we can use RoyalEnfieldBike");
    }

    static void doesItHaveGoodMileage() {
        System.out.println("Yes it has good mileage");
    }

    static void isItPowerful() {
        System.out.println("Yes it is powerful");
    }

    static void isItLightWeight() {
        System.out.println("No it is not lightweight");
    }

    static void isItEasyToHandle() {
        System.out.println("Yes it is easy to handle");
    }
}