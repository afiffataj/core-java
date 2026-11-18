class Televisionn {
    static int screenSize = 43;
    static byte noOfSpeakers = 2;
    static String color = "Black";
    static String displayType = "LED";

    public static void main(String[] args) {
        System.out.println("Television is used for entertainment");

        int price = 35000;
        byte warranty = 3;
        String brand = "Samsung";

        System.out.println(Televisionn.screenSize);
        System.out.println(Televisionn.noOfSpeakers);
        System.out.println(Televisionn.color);
        System.out.println(Televisionn.displayType);
        System.out.println(price);
        System.out.println(warranty);
        System.out.println(brand);
    }
}