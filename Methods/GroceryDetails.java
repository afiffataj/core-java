class GroceryDetails {
    public static void main(String[] args) {

        System.out.println("The grocery details");

        String item = "Rice";
        int quantity = 5;
        double price = 350.75;
        boolean available = true;

        GroceryDetails.display(item, quantity, price, available);
    }

    static String display(String a, int b, double c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}