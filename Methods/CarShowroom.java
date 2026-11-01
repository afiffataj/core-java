class CarShowroom {
    public static void main(String[] args) {

        System.out.println("Is Showroom Open");
        CarShowroom.isShowroomOpen();

        System.out.println("Is Manager Present");
        CarShowroom.isManagerPresent();

        System.out.println("Car Type");
        char type = CarShowroom.getCarType();
        System.out.println(type);

        System.out.println("Are All Cars Available");
        boolean available = CarShowroom.areAllCarsAvailable();
        System.out.println(available);

        System.out.println("Car Brand");
        CarShowroom.getCarBrand("BMW");

        System.out.println("Car Prices");
        CarShowroom.getCarPrice(500000, 750000);

        System.out.println("Car Colors");
        CarShowroom.getCarColors("Red", "Black", "White");

        System.out.println("Car Mileage");
        float mileage = CarShowroom.getCarMileage(25.5f);
        System.out.println(mileage);

        System.out.println("Car Weight");
        double weight = CarShowroom.getCarWeight(1200.5, 1400.5);
        System.out.println(weight);

        System.out.println("Car Numbers");
        int number = CarShowroom.getCarNumber(123, 456, 789);
        System.out.println(number);
    }

    static void isShowroomOpen() {
        System.out.println("Yes, Showroom is Open");
    }

    static void isManagerPresent() {
        System.out.println("Yes, Manager is Present");
    }

    static char getCarType() {
        return 'S';
    }

    static boolean areAllCarsAvailable() {
        return true;
    }

    static void getCarBrand(String brand) {
        System.out.println(brand);
    }

    static void getCarPrice(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getCarColors(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getCarMileage(float mileage) {
        return mileage;
    }

    static double getCarWeight(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getCarNumber(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}