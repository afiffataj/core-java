class ElectricityDetails {
    public static void main(String[] args) {

        System.out.println("The electricity details");

        int units = 250;
        double bill = 1250.50;
        float voltage = 230.5f;
        boolean paid = false;

        ElectricityDetails.display(units, bill, voltage, paid);
    }

    static int display(int a, double b, float c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}