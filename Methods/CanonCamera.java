class CanonCamera {
    static String brand = "Canon";
    static String cameraType = "DSLR";
    static double megapixels = 24.2d;
    static int lensMount = 1;
    static String countryOfOrigin = "Japan";

    public static void main(String[] args) {
        String color = "Black";
        int discount = 22;
        double weight = 650.8d;
        long productNo = 5678901234l;
        String genericName = "Canon EOS 200D";

        System.out.println(CanonCamera.brand);
        System.out.println(CanonCamera.cameraType);
        System.out.println(CanonCamera.megapixels);
        System.out.println(CanonCamera.lensMount);
        System.out.println(CanonCamera.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		canWeUse();
		doesItHaveGoodCamera();
		isItPortable();
		isItWaterproof();
		isItEasyToHandle();
    }

    static void canWeUse() {
        System.out.println("Yes we can use CanonCamera");
    }

    static void doesItHaveGoodCamera() {
        System.out.println("Yes it has a good camera");
    }

    static void isItPortable() {
        System.out.println("Yes it is portable");
    }

    static void isItWaterproof() {
        System.out.println("No it is not waterproof");
    }

    static void isItEasyToHandle() {
        System.out.println("Yes it is easy to handle");
    }
}