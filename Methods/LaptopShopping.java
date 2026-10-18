class LaptopShopping {
    public static void main(String[] args) {

        System.out.println("the price of laptop");
        long price = LaptopShopping.laptopPrice();
        System.out.println(price);

        System.out.println("the brand of laptop");
        System.out.println(LaptopShopping.laptopBrand());

        System.out.println("the quantity of laptop");
        byte quantity = LaptopShopping.laptopQuantity();
        System.out.println(quantity);

        System.out.println("the weight of laptop");
        double weight = LaptopShopping.laptopWeight();
        System.out.println(weight);

        System.out.println("the processor speed of laptop");
        float speed = LaptopShopping.laptopSpeed();
        System.out.println(speed);

        System.out.println("is laptop available");
        boolean available = LaptopShopping.laptopAvailable();
        System.out.println(available);

        System.out.println("the laptop grade");
        char grade = LaptopShopping.laptopGrade();
        System.out.println(grade);
    }

    static long laptopPrice() {
        long price = 85000L;
        return price;
    }

    static String laptopBrand() {
        String brand = "HP";
        return brand;
    }

    static byte laptopQuantity() {
        byte quantity = 3;
        return quantity;
    }

    static double laptopWeight() {
        double weight = 1.75d;
        return weight;
    }

    static float laptopSpeed() {
        float speed = 4.5f;
        return speed;
    }

    static boolean laptopAvailable() {
        boolean available = true;
        return available;
    }

    static char laptopGrade() {
        char grade = 'A';
        return grade;
    }
}