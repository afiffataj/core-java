class Projector {
    public static void main(String[] args) {

        System.out.println("Is projector available?");
        Projector.isProjectorAvailable();

        System.out.println("The brand of projector is");
        String brand = Projector.theBrandOfProjector();
        System.out.println(brand);

        System.out.println("The price of projector");
        int a = 45000;
        Projector.thePriceOfProjector(a);

        System.out.println("The color of projector");
        String color = "Black";
        Projector.theColorOfProjector(color);
    }

    static void isProjectorAvailable() {
        System.out.println("Yes projector is available");
    }

    static String theBrandOfProjector() {
        String brand = "Epson";
        return brand;
    }

    static void thePriceOfProjector(int a) {
        System.out.println(a);
    }

    static String theColorOfProjector(String c) {
        System.out.println(c);
        return c;
    }
}