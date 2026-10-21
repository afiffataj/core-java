class Account {
    public static void main(String[] args) {

        System.out.println("Are the account balances available");

        double balance = 15000.75;
        double balance1 = 25000.50;

        Account.areTheAccountBalancesAvailable(balance, balance1);
    }

    static void areTheAccountBalancesAvailable(double a, double b) {
        System.out.println(a);
        System.out.println(b);
    }
}