class ShoppingDiscount {
    public static void main(String[] args) {

        System.out.println("Minimum purchase amount for discount");
        int amount = 2500;

        if(amount >= 2000) {
            System.out.println("Congratulations! You are eligible for a discount");
        }
        else {
            System.out.println("Sorry! You are not eligible for a discount");
        }
    }
}