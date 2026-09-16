class Umbrella {
    public static void main(String[] args) {

        System.out.println("Umbrella protects us from rain and sunlight");

        String brand = "Puma";
        String color = "Yellow";
        float length = 85.5f;
        double weight = 0.45d;
        byte noOfRibs = 8;
        int price = 1200;
        char size = 'L';
        boolean isAvailable = true;
        long productCode = 789123456L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("length before re-initialization=" + length);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("noOfRibs before re-initialization=" + noOfRibs);
        System.out.println("price before re-initialization=" + price);
        System.out.println("size before re-initialization=" + size);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("productCode before re-initialization=" + productCode);
        System.out.println();

        brand = "Wildcraft";
        color = "Blue";
        length = 90.5f;
        weight = 0.50d;
        noOfRibs = 10;
        price = 1500;
        size = 'M';
        isAvailable = false;
        productCode = 891234567L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("length after first re-initialization=" + length);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("noOfRibs after first re-initialization=" + noOfRibs);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("size after first re-initialization=" + size);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("productCode after first re-initialization=" + productCode);
        System.out.println();

        brand = "Totes";
        color = "Pink";
        length = 80.0f;
        weight = 0.40d;
        noOfRibs = 6;
        price = 950;
        size = 'S';
        isAvailable = true;
        productCode = 912345678L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("length after second re-initialization=" + length);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("noOfRibs after second re-initialization=" + noOfRibs);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("size after second re-initialization=" + size);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("productCode after second re-initialization=" + productCode);
    }
}