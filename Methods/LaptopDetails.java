class LaptopDetails {
    public static void main(String[] args) {

        System.out.println("The laptop details");

        String brand = "Dell";
        int ram = 16;
        double price = 55000.50;
        boolean available = true;

        LaptopDetails.display(brand, ram, price, available);
    }

    static String display(String a, int b, double c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}