class Camera {
    static int megapixels = 48;
    static byte noOfLenses = 3;
    static String color = "Black";
    static String cameraType = "Digital";

    public static void main(String[] args) {
        System.out.println("Camera is used to capture photographs");

        int price = 25000;
        byte warranty = 2;
        String brand = "Canon";

        System.out.println(Camera.megapixels);
        System.out.println(Camera.noOfLenses);
        System.out.println(Camera.color);
        System.out.println(Camera.cameraType);
        System.out.println(price);
        System.out.println(warranty);
        System.out.println(brand);
    }
}