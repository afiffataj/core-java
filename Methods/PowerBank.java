class PowerBank {
    public static void main(String[] args) {

        System.out.println("the price of power bank");
        long price = PowerBank.powerBankPrice();
        System.out.println(price);

        System.out.println("the brand of power bank");
        System.out.println(PowerBank.powerBankBrand());

        System.out.println("the quantity of power bank");
        byte quantity = PowerBank.powerBankQuantity();
        System.out.println(quantity);

        System.out.println("the weight of power bank");
        double weight = PowerBank.powerBankWeight();
        System.out.println(weight);

        System.out.println("the capacity of power bank");
        float capacity = PowerBank.powerBankCapacity();
        System.out.println(capacity);

        System.out.println("is power bank fast charging");
        boolean fastCharging = PowerBank.powerBankFastCharging();
        System.out.println(fastCharging);

        System.out.println("the power bank color code");
        char color = PowerBank.powerBankColor();
        System.out.println(color);
    }

    static long powerBankPrice() {
        return 2500L;
    }

    static String powerBankBrand() {
        return "Ambrane";
    }

    static byte powerBankQuantity() {
        return 5;
    }

    static double powerBankWeight() {
        return 0.350d;
    }

    static float powerBankCapacity() {
        return 20000.0f;
    }

    static boolean powerBankFastCharging() {
        return true;
    }

    static char powerBankColor() {
        return 'B';
    }
}