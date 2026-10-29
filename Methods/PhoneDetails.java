class PhoneDetails {
    public static void main(String[] args) {

        System.out.println("The phone details");

        String model = "iPhone";
        long serialNumber = 123456789L;
        int storage = 256;
        float screenSize = 6.1f;

        PhoneDetails.display(model, serialNumber, storage, screenSize);
    }

    static String display(String a, long b, int c, float d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}