class ShortNumbers {
    public static void main(String[] args) {

        System.out.println("The short numbers");

        short a = 100;
        short b = 200;

        ShortNumbers.display(a, b);
    }

    static short display(short a, short b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}