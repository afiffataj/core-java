class Headphones {
    static int soundLevel = 80;
    static byte noOfSpeakers = 2;
    static String color = "Black";
    static String connectionType = "Bluetooth";

    public static void main(String[] args) {
        System.out.println("Headphones are used to listen to music");

        int price = 1499;
        byte warranty = 2;
        String brand = "Boat";

        System.out.println(Headphones.soundLevel);
        System.out.println(Headphones.noOfSpeakers);
        System.out.println(Headphones.color);
        System.out.println(Headphones.connectionType);
        System.out.println(price);
        System.out.println(warranty);
        System.out.println(brand);
    }
}