class AirConditioner {
    public static void main(String[] args) {

        System.out.println("Air conditioner helps maintain a comfortable room temperature");

        String brand = "Daikin";
        String color = "White";
        float capacity = 1.5f;
        double weight = 32.5d;
        byte starRating = 5;
        int price = 42000;
        char grade = 'A';
        boolean isAvailable = true;
        long modelNumber = 123456789L;

        System.out.println("brand before re-initialization=" + brand);
        System.out.println("color before re-initialization=" + color);
        System.out.println("capacity before re-initialization=" + capacity);
        System.out.println("weight before re-initialization=" + weight);
        System.out.println("starRating before re-initialization=" + starRating);
        System.out.println("price before re-initialization=" + price);
        System.out.println("grade before re-initialization=" + grade);
        System.out.println("isAvailable before re-initialization=" + isAvailable);
        System.out.println("modelNumber before re-initialization=" + modelNumber);
        System.out.println();

        brand = "Voltas";
        color = "Silver";
        capacity = 2.0f;
        weight = 35.5d;
        starRating = 3;
        price = 38000;
        grade = 'B';
        isAvailable = false;
        modelNumber = 234567891L;

        System.out.println("brand after first re-initialization=" + brand);
        System.out.println("color after first re-initialization=" + color);
        System.out.println("capacity after first re-initialization=" + capacity);
        System.out.println("weight after first re-initialization=" + weight);
        System.out.println("starRating after first re-initialization=" + starRating);
        System.out.println("price after first re-initialization=" + price);
        System.out.println("grade after first re-initialization=" + grade);
        System.out.println("isAvailable after first re-initialization=" + isAvailable);
        System.out.println("modelNumber after first re-initialization=" + modelNumber);
        System.out.println();

        brand = "Blue Star";
        color = "Grey";
        capacity = 1.0f;
        weight = 29.8d;
        starRating = 4;
        price = 36000;
        grade = 'A';
        isAvailable = true;
        modelNumber = 345678912L;

        System.out.println("brand after second re-initialization=" + brand);
        System.out.println("color after second re-initialization=" + color);
        System.out.println("capacity after second re-initialization=" + capacity);
        System.out.println("weight after second re-initialization=" + weight);
        System.out.println("starRating after second re-initialization=" + starRating);
        System.out.println("price after second re-initialization=" + price);
        System.out.println("grade after second re-initialization=" + grade);
        System.out.println("isAvailable after second re-initialization=" + isAvailable);
        System.out.println("modelNumber after second re-initialization=" + modelNumber);
    }
}