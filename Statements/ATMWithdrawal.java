class ATMWithdrawal {
    public static void main(String[] args) {

        System.out.println("Available bank balance");
        int balance = 5000;

        System.out.println("Amount to withdraw");
        int amount = 3000;

        if(balance >= amount) {
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}