class FruitDetails {
    public static void main(String[] args) {

        System.out.println("The fruit details");

        String name = "Mango";
        int quantity = 10;
        double price = 250.75;
        char grade = 'A';

        FruitDetails.display(name, quantity, price, grade);
    }

    static String display(String a, int b, double c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}