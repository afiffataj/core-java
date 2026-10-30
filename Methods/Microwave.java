class Microwave {
    public static void main(String[] args) {

        System.out.println("Is microwave available?");
        Microwave.isMicrowaveAvailable();

        System.out.println("The brand of microwave is");
        String brand = Microwave.theBrandOfMicrowave();
        System.out.println(brand);

        System.out.println("The price of microwave");
        int a = 12000;
        Microwave.thePriceOfMicrowave(a);

        System.out.println("The color of microwave");
        String color = "Silver";
        Microwave.theColorOfMicrowave(color);
    }

    static void isMicrowaveAvailable() {
        System.out.println("Yes microwave is available");
    }

    static String theBrandOfMicrowave() {
        String brand = "Samsung";
        return brand;
    }

    static void thePriceOfMicrowave(int a) {
        System.out.println(a);
    }

    static String theColorOfMicrowave(String c) {
        System.out.println(c);
        return c;
    }
}