class BankManagement {
    public static void main(String[] args) {

        System.out.println("Bank Details");

        int accountNumber = 12345;
        int accountNumber1 = 67890;

        BankManagement.printAccountNumbers(accountNumber, accountNumber1);
        BankManagement.printAccountHolders("Rahul", "Amit");
        BankManagement.printAccountStatus(true, false);
    }

    static void printAccountNumbers(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printAccountHolders(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printAccountStatus(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}