class Headphones {
    public static void main(String[] args) {

        System.out.println("Are headphones available?");
        Headphones.areHeadphonesAvailable();

        System.out.println("The brand of headphones is");
        String brand = Headphones.theBrandOfHeadphones();
        System.out.println(brand);

        System.out.println("The price of headphones");
        int a = 2000;
        Headphones.thePriceOfHeadphones(a);

        System.out.println("The color of headphones");
        String color = "White";
        Headphones.theColorOfHeadphones(color);
    }

    static void areHeadphonesAvailable() {
        System.out.println("Yes headphones are available");
    }

    static String theBrandOfHeadphones() {
        String brand = "JBL";
        return brand;
    }

    static void thePriceOfHeadphones(int a) {
        System.out.println(a);
    }

    static String theColorOfHeadphones(String c) {
        System.out.println(c);
        return c;
    }
}