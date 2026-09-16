class SchoolBag {
    public static void main(String[] args) {

        System.out.println("School bag helps students carry their books");

        String brand = "Skybags";
        String color = "Black";
        float capacity = 35.5f;
        double weight = 0.75d;
        byte noOfCompartments = 4;
        int price = 1800;
        char size = 'M';
        boolean isAvailable = true;
        long productCode = 741852963L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("capacity before re-initialization=" + capacity);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("noOfCompartments before re-initialization=" + noOfCompartments);
        System.out.println("price before re-initialization=" + price);
        System.out.println("size before re-initialization=" + size);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("productCode before re-initialization=" + productCode);
        System.out.println();

        brand = "American Tourister";
        color = "Red";
        capacity = 40.0f;
        weight = 0.90d;
        noOfCompartments = 5;
        price = 2200;
        size = 'L';
        isAvailable = false;
        productCode = 852963741L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("capacity after first re-initialization=" + capacity);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("noOfCompartments after first re-initialization=" + noOfCompartments);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("size after first re-initialization=" + size);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("productCode after first re-initialization=" + productCode);
        System.out.println();

        brand = "Wildcraft";
        color = "Green";
        capacity = 30.5f;
        weight = 0.65d;
        noOfCompartments = 3;
        price = 1600;
        size = 'S';
        isAvailable = true;
        productCode = 963741852L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("capacity after second re-initialization=" + capacity);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("noOfCompartments after second re-initialization=" + noOfCompartments);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("size after second re-initialization=" + size);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("productCode after second re-initialization=" + productCode);
    }
}