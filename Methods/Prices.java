class Prices {
    public static void main(String[] args) {

        System.out.println("The prices");

        double a = 25.50;
        double b = 35.75;

        Prices.display(a, b);
    }

    static double display(double a, double b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}