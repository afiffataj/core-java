class Microwave {
    public static void main(String[] args) {

        System.out.println("Microwave oven helps in heating and cooking food");

        String brand = "IFB";
        String color = "Black";
        float capacity = 20.5f;
        double weight = 11.5d;
        byte powerLevels = 5;
        int price = 9000;
        char rating = 'A';
        boolean isAvailable = true;
        long productCode = 123456789L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("capacity before re-initialization=" + capacity);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("powerLevels before re-initialization=" + powerLevels);
        System.out.println("price before re-initialization=" + price);
        System.out.println("rating before re-initialization=" + rating);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("productCode before re-initialization=" + productCode);
        System.out.println();

        brand = "LG";
        color = "Silver";
        capacity = 25.5f;
        weight = 13.2d;
        powerLevels = 6;
        price = 11500;
        rating = 'B';
        isAvailable = false;
        productCode = 234567891L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("capacity after first re-initialization=" + capacity);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("powerLevels after first re-initialization=" + powerLevels);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("rating after first re-initialization=" + rating);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("productCode after first re-initialization=" + productCode);
        System.out.println();

        brand = "Samsung";
        color = "White";
        capacity = 28.0f;
        weight = 14.0d;
        powerLevels = 7;
        price = 13500;
        rating = 'A';
        isAvailable = true;
        productCode = 345678912L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("capacity after second re-initialization=" + capacity);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("powerLevels after second re-initialization=" + powerLevels);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("rating after second re-initialization=" + rating);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("productCode after second re-initialization=" + productCode);
    }
}