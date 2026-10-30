class Keyboard {
    public static void main(String[] args) {

        System.out.println("Is keyboard available?");
        Keyboard.isKeyboardAvailable();

        System.out.println("The brand of keyboard is");
        String brand = Keyboard.theBrandOfKeyboard();
        System.out.println(brand);

        System.out.println("The price of keyboard");
        int a = 1500;
        Keyboard.thePriceOfKeyboard(a);

        System.out.println("The color of keyboard");
        String color = "Grey";
        Keyboard.theColorOfKeyboard(color);
    }

    static void isKeyboardAvailable() {
        System.out.println("Yes keyboard is available");
    }

    static String theBrandOfKeyboard() {
        String brand = "Logitech";
        return brand;
    }

    static void thePriceOfKeyboard(int a) {
        System.out.println(a);
    }

    static String theColorOfKeyboard(String c) {
        System.out.println(c);
        return c;
    }
}