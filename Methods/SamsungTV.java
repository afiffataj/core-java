class SamsungTV {
    static String brand = "Samsung";
    static String operatingSystem = "Tizen";
    static double screenSize = 55.0d;
    static int resolution = 4;
    static String countryOfOrigin = "South Korea";

    public static void main(String[] args) {
        String color = "Black";
        int discount = 35;
        double weight = 18.5d;
        long productNo = 7890123456l;
        String genericName = "Samsung 55 Inch Smart TV";

        System.out.println(SamsungTV.brand);
        System.out.println(SamsungTV.operatingSystem);
        System.out.println(SamsungTV.screenSize);
        System.out.println(SamsungTV.resolution);
        System.out.println(SamsungTV.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		SamsungTV.canWeUse();
		SamsungTV.doesItHaveHighResolution();
		SamsungTV.isItSmart();
		SamsungTV.isItPortable();
		isItEasyToOperate();
    }

    static void canWeUse() {
        System.out.println("Yes we can use SamsungTV");
    }

    static void doesItHaveHighResolution() {
        System.out.println("Yes it has high resolution");
    }

    static void isItSmart() {
        System.out.println("Yes it is a smart TV");
    }

    static void isItPortable() {
        System.out.println("No it is not easily portable");
    }

    static void isItEasyToOperate() {
        System.out.println("Yes it is easy to operate");
    }
}