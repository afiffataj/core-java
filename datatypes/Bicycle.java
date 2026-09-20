class Bicycle {
    public static void main(String[] args) {

        System.out.println("Bicycle is useful for transportation and exercise");

        String brand = "Hero";
        String color = "Red";
        float wheelSize = 26.5f;
        double weight = 12.5d;
        byte noOfGears = 6;
        int price = 8500;
        char size = 'M';
        boolean isAvailable = true;
        long serialNumber = 123456789L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("wheelSize before re-initialization=" + wheelSize);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("noOfGears before re-initialization=" + noOfGears);
        System.out.println("price before re-initialization=" + price);
        System.out.println("size before re-initialization=" + size);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("serialNumber before re-initialization=" + serialNumber);
        System.out.println();

        brand = "Firefox";
        color = "Blue";
        wheelSize = 27.5f;
        weight = 11.8d;
        noOfGears = 7;
        price = 12500;
        size = 'L';
        isAvailable = false;
        serialNumber = 234567891L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("wheelSize after first re-initialization=" + wheelSize);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("noOfGears after first re-initialization=" + noOfGears);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("size after first re-initialization=" + size);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("serialNumber after first re-initialization=" + serialNumber);
        System.out.println();

        brand = "BSA";
        color = "Green";
        wheelSize = 24.5f;
        weight = 10.6d;
        noOfGears = 5;
        price = 7200;
        size = 'S';
        isAvailable = true;
        serialNumber = 345678912L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("wheelSize after second re-initialization=" + wheelSize);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("noOfGears after second re-initialization=" + noOfGears);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("size after second re-initialization=" + size);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("serialNumber after second re-initialization=" + serialNumber);
    }
}