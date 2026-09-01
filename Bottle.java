class Bottle{

    static void fillBottle(){
        System.out.println("Bottle is filled with water");
		//fillBottle();
    }

    static void emptyBottle(){
        System.out.println("Bottle is empty");
		//emptyBottle();
    }

    public static void main(String[] args){

        fillBottle();
        emptyBottle();

        int bottleId = 501;
        String bottleName = "Water Bottle";
        String bottleType = "Plastic";
        int bottlePrice = 150;
        double bottleCapacity = 1.0;
        String bottleColor = "Blue";
        String bottleMaterial = "Plastic";
        String bottleBrand = "Milton";
        boolean hasCap = true;
        String bottleShape = "Cylinder";
        String shopName = "Home Store";
        String location = "Bengaluru";
        String manufacturer = "Milton";
        int quantity = 100;
        String manufactureDate = "01-08-2026";
        String expiryDate = "01-08-2031";
        double rating = 4.6;
        boolean isAvailable = true;
        String purpose = "Drinking Water";
        double bottleWeight = 250.5;

        System.out.println("Bottle ID: " + bottleId);
        System.out.println("Bottle Name: " + bottleName);
        System.out.println("Bottle Type: " + bottleType);
        System.out.println("Bottle Price: " + bottlePrice);
        System.out.println("Bottle Capacity: " + bottleCapacity);
        System.out.println("Bottle Color: " + bottleColor);
        System.out.println("Bottle Material: " + bottleMaterial);
        System.out.println("Bottle Brand: " + bottleBrand);
        System.out.println("Has Cap: " + hasCap);
        System.out.println("Bottle Shape: " + bottleShape);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Bottle Weight: " + bottleWeight);
    }
}