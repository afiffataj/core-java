class MobileDetails {
    public static void main(String[] args) {

        System.out.println("The mobile details");

        String brand = "Samsung";
        int price = 20000;
        float rating = 4.5f;
        boolean available = true;

        MobileDetails.display(brand, price, rating, available);
    }

    static String display(String a, int b, float c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}