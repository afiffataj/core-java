class Printer {
    public static void main(String[] args) {

        System.out.println("the price of printer");
        long price = Printer.printerPrice();
        System.out.println(price);

        System.out.println("the brand of printer");
        System.out.println(Printer.printerBrand());

        System.out.println("the quantity of printer");
        byte quantity = Printer.printerQuantity();
        System.out.println(quantity);

        System.out.println("the weight of printer");
        double weight = Printer.printerWeight();
        System.out.println(weight);

        System.out.println("the printing speed of printer");
        float speed = Printer.printerSpeed();
        System.out.println(speed);

        System.out.println("is printer wireless");
        boolean wireless = Printer.printerWireless();
        System.out.println(wireless);

        System.out.println("the printer color code");
        char color = Printer.printerColor();
        System.out.println(color);
    }

    static long printerPrice() {
        return 16000L;
    }

    static String printerBrand() {
        return "Epson";
    }

    static byte printerQuantity() {
        return 2;
    }

    static double printerWeight() {
        return 5.2d;
    }

    static float printerSpeed() {
        return 20.5f;
    }

    static boolean printerWireless() {
        return true;
    }

    static char printerColor() {
        return 'W';
    }
}