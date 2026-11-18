class WristWatch {
    static int displaySize = 2;
    static byte noOfButtons = 3;
    static String color = "Rose Gold";
    static String strapType = "Leather";

    public static void main(String[] args) {
        System.out.println("WristWatch is used to check time");

        int price = 2500;
        byte warranty = 2;
        String brand = "Titan";

        System.out.println(WristWatch.displaySize);
        System.out.println(WristWatch.noOfButtons);
        System.out.println(WristWatch.color);
        System.out.println(WristWatch.strapType);
        System.out.println(price);
        System.out.println(warranty);
        System.out.println(brand);
    }
}