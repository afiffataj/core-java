class DiningTable {
    public static void main(String[] args) {

        System.out.println("Dining table is used for serving meals");

        String material = "Wood";
        String color = "Brown";
        float length = 6.5f;
        double weight = 35.5d;
        byte noOfChairs = 4;
        int price = 28000;
        char quality = 'A';
        boolean isAvailable = true;
        long productCode = 456789123L;

        System.out.println("material before re-initialization=" + material);
        System.out.println("color before re-initialization=" + color);
        System.out.println("length before re-initialization=" + length);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("noOfChairs before re-initialization=" + noOfChairs);
        System.out.println("price before re-initialization=" + price);
        System.out.println("quality before re-initialization=" + quality);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("productCode before re-initialization=" + productCode);
        System.out.println();

        material = "Glass";
        color = "Black";
        length = 5.5f;
        weight = 28.8d;
        noOfChairs = 6;
        price = 35000;
        quality = 'B';
        isAvailable = false;
        productCode = 567891234L;

        System.out.println("material after first re-initialization=" + material);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("length after first re-initialization=" + length);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("noOfChairs after first re-initialization=" + noOfChairs);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("quality after first re-initialization=" + quality);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("productCode after first re-initialization=" + productCode);
        System.out.println();

        material = "Marble";
        color = "White";
        length = 7.5f;
        weight = 42.2d;
        noOfChairs = 8;
        price = 45000;
        quality = 'A';
        isAvailable = true;
        productCode = 678912345L;

        System.out.println("material after second re-initialization=" + material);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("length after second re-initialization=" + length);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("noOfChairs after second re-initialization=" + noOfChairs);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("quality after second re-initialization=" + quality);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("productCode after second re-initialization=" + productCode);
    }
}