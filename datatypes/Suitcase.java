class Suitcase {
    public static void main(String[] args) {

        System.out.println("Suitcase is useful for carrying luggage during travel");

        String brand = "Safari";
        String color = "Red";
        float capacity = 55.5f;
        double weight = 3.5d;
        byte noOfWheels = 4;
        int price = 4500;
        char size = 'L';
        boolean isAvailable = true;
        long productCode = 147258369L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("capacity before re-initialization=" + capacity);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("noOfWheels before re-initialization=" + noOfWheels);
        System.out.println("price before re-initialization=" + price);
        System.out.println("size before re-initialization=" + size);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("productCode before re-initialization=" + productCode);
        System.out.println();

        brand = "VIP";
        color = "Blue";
        capacity = 65.5f;
        weight = 4.2d;
        noOfWheels = 4;
        price = 5800;
        size = 'L';
        isAvailable = false;
        productCode = 258369147L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("capacity after first re-initialization=" + capacity);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("noOfWheels after first re-initialization=" + noOfWheels);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("size after first re-initialization=" + size);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("productCode after first re-initialization=" + productCode);
        System.out.println();

        brand = "American Tourister";
        color = "Green";
        capacity = 45.0f;
        weight = 3.0d;
        noOfWheels = 8;
        price = 6200;
        size = 'M';
        isAvailable = true;
        productCode = 369147258L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("capacity after second re-initialization=" + capacity);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("noOfWheels after second re-initialization=" + noOfWheels);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("size after second re-initialization=" + size);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("productCode after second re-initialization=" + productCode);
    }
}