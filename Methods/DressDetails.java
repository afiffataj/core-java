class DressDetails {
    public static void main(String[] args) {

        System.out.println("The dress details");

        String brand = "Zara";
        int size = 32;
        double price = 1999.50;
        char color = 'B';

        DressDetails.display(brand, size, price, color);
    }

    static String display(String a, int b, double c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}