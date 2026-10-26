class RestaurantDetails {
    public static void main(String[] args) {

        System.out.println("The restaurant details");

        String name = "Food Palace";
        double price = 150.75;
        int tables = 25;
        char rating = 'A';

        RestaurantDetails.display(name, price, tables, rating);
    }

    static String display(String a, double b, int c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}