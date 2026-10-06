class DellLaptop {
    static String brand = "Dell";
    static String operatingSystem = "Windows";
    static double cpuSpeed = 4.8d;
    static int memory = 16;
    static String countryOfOrigin = "USA";

    public static void main(String[] args) {
        String color = "Silver";
        int discount = 25;
        double weight = 1.65d;
        long productNo = 5678901234l;
        String genericName = "Dell Inspiron 15";

        System.out.println(DellLaptop.brand);
        System.out.println(DellLaptop.operatingSystem);
        System.out.println(DellLaptop.cpuSpeed);
        System.out.println(DellLaptop.memory);
        System.out.println(DellLaptop.countryOfOrigin);
        System.out.println(color);
        System.out.println(discount);
        System.out.println(weight);
        System.out.println(productNo);
        System.out.println(genericName);
		DellLaptop.canWeUse();
		DellLaptop.doesItHaveHighMemory();
		DellLaptop.isItPortable();
		DellLaptop.isItPowerful();
		DellLaptop.isItEasyToHandle();
    }

    static void canWeUse() {
        System.out.println("Yes we can use DellLaptop");
    }

    static void doesItHaveHighMemory() {
        System.out.println("Yes it has good memory");
    }

    static void isItPortable() {
        System.out.println("Yes it is portable");
    }

    static void isItPowerful() {
        System.out.println("Yes it is powerful");
    }

    static void isItEasyToHandle() {
        System.out.println("Yes it is easy to handle");
    }
}