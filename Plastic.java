class Plastic{

    static void usePlastic(){
        System.out.println("Plastic is useful");
    }

    static void recyclePlastic(){
        System.out.println("Plastic should be recycled");
		//recyclePlastic();
		
    }

    public static void main(String[] args){

        usePlastic();
        recyclePlastic();

        int plasticId = 901;
        String plasticName = "Water Bottle";
        String plasticType = "PET";
        int plasticPrice = 80;
        double plasticWeight = 250.5;
        String plasticColor = "Blue";
        String plasticShape = "Cylinder";
        String plasticBrand = "Milton";
        boolean isRecyclable = true;
        String plasticQuality = "High";
        String manufacturer = "ABC Plastics";
        String location = "Bengaluru";
        int quantity = 500;
        String manufactureDate = "01-08-2026";
        String expiryDate = "01-08-2031";
        double rating = 4.5;
        boolean isAvailable = true;
        String purpose = "Storage";
        String material = "Polyethylene";
        String ownerName = "Ramesh";

        System.out.println("Plastic ID: " + plasticId);
        System.out.println("Plastic Name: " + plasticName);
        System.out.println("Plastic Type: " + plasticType);
        System.out.println("Plastic Price: " + plasticPrice);
        System.out.println("Plastic Weight: " + plasticWeight);
        System.out.println("Plastic Color: " + plasticColor);
        System.out.println("Plastic Shape: " + plasticShape);
        System.out.println("Plastic Brand: " + plasticBrand);
        System.out.println("Recyclable: " + isRecyclable);
        System.out.println("Plastic Quality: " + plasticQuality);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Location: " + location);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Material: " + material);
        System.out.println("Owner Name: " + ownerName);
    }
}