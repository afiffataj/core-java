class Bank {
    public static void main(String[] args) {

        System.out.println("Is Bank Open");
        Bank.isBankOpen();

        System.out.println("Is Manager Available");
        Bank.isManagerAvailable();

        System.out.println("Bank Grade");
        char grade = Bank.getBankGrade();
        System.out.println(grade);

        System.out.println("Are All Services Available");
        boolean services = Bank.areAllServicesAvailable();
        System.out.println(services);

        System.out.println("Bank Name");
        Bank.getBankName("SBI");

        System.out.println("Account Numbers");
        Bank.getAccountNumbers(12345, 67890);

        System.out.println("Account Types");
        Bank.getAccountTypes("Savings", "Current", "Salary");

        System.out.println("Interest Rate");
        float rate = Bank.getInterestRate(7.5f);
        System.out.println(rate);

        System.out.println("Account Balances");
        double balance = Bank.getAccountBalances(25000.5, 35000.5);
        System.out.println(balance);

        System.out.println("Branch Numbers");
        int branch = Bank.getBranchNumbers(101, 102, 103);
        System.out.println(branch);
    }

    static void isBankOpen() {
        System.out.println("Yes Bank is Open");
    }

    static void isManagerAvailable() {
        System.out.println("Yes Manager is Available");
    }

    static char getBankGrade() {
        return 'A';
    }

    static boolean areAllServicesAvailable() {
        return true;
    }

    static void getBankName(String name) {
        System.out.println(name);
    }

    static void getAccountNumbers(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getAccountTypes(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getInterestRate(float rate) {
        return rate;
    }

    static double getAccountBalances(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getBranchNumbers(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}