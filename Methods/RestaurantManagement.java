class RestaurantManagement {
    public static void main(String[] args) {

        System.out.println("Restaurant Details");

        int tableNumber = 10;
        int tableNumber1 = 20;

        RestaurantManagement.printTableNumbers(tableNumber, tableNumber1);
        RestaurantManagement.printFoodNames("Pizza", "Burger");
        RestaurantManagement.printFoodPrices(250.50, 150.75);
    }

    static void printTableNumbers(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printFoodNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printFoodPrices(double a, double b) {
        System.out.println(a);
        System.out.println(b);
    }
}