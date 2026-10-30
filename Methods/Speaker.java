class Speaker {
    public static void main(String[] args) {

        System.out.println("Is speaker available?");
        Speaker.isSpeakerAvailable();

        System.out.println("The brand of speaker is");
        String brand = Speaker.theBrandOfSpeaker();
        System.out.println(brand);

        System.out.println("The price of speaker");
        int a = 5000;
        Speaker.thePriceOfSpeaker(a);

        System.out.println("The color of speaker");
        String color = "Blue";
        Speaker.theColorOfSpeaker(color);
    }

    static void isSpeakerAvailable() {
        System.out.println("Yes speaker is available");
    }

    static String theBrandOfSpeaker() {
        String brand = "Boat";
        return brand;
    }

    static void thePriceOfSpeaker(int a) {
        System.out.println(a);
    }

    static String theColorOfSpeaker(String c) {
        System.out.println(c);
        return c;
    }
}