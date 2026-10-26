class FlowerDetails {
    public static void main(String[] args) {

        System.out.println("The flower details");

        String name = "Rose";
        char color = 'R';
        int quantity = 25;
        float price = 15.5f;

        FlowerDetails.display(name, color, quantity, price);
    }

    static String display(String a, char b, int c, float d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}