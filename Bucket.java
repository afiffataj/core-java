class Bucket{

    static void fillBucket(){
        System.out.println("Bucket is filled with water");
		//fillBucket();
    }

    static void emptyBucket(){
        System.out.println("Bucket is empty");
    }

    public static void main(String[] args){

        fillBucket();
        emptyBucket();

        int bucketId = 1001;
        String bucketName = "Water Bucket";
        String bucketType = "Plastic";
        int bucketPrice = 250;
        double bucketCapacity = 20.0;
        String bucketColor = "Blue";
        String bucketShape = "Round";
        String bucketBrand = "Supreme";
        boolean hasHandle = true;
        String bucketQuality = "High";
        String manufacturer = "ABC Plastics";
        String location = "Bengaluru";
        int quantity = 75;
        String manufactureDate = "01-08-2026";
        String warranty = "1 Year";
        double rating = 4.6;
        boolean isAvailable = true;
        String purpose = "Water Storage";
        String material = "Plastic";
        String ownerName = "Ramesh";

        System.out.println("Bucket ID: " + bucketId);
        System.out.println("Bucket Name: " + bucketName);
        System.out.println("Bucket Type: " + bucketType);
        System.out.println("Bucket Price: " + bucketPrice);
        System.out.println("Bucket Capacity: " + bucketCapacity);
        System.out.println("Bucket Color: " + bucketColor);
        System.out.println("Bucket Shape: " + bucketShape);
        System.out.println("Bucket Brand: " + bucketBrand);
        System.out.println("Has Handle: " + hasHandle);
        System.out.println("Bucket Quality: " + bucketQuality);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Location: " + location);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Warranty: " + warranty);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Material: " + material);
        System.out.println("Owner Name: " + ownerName);
    }
}