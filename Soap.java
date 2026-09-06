class Soap{

    static void useSoap(){
        System.out.println("Soap is used for cleaning");
		//useSoap();
    }

    static void buySoap(){
        System.out.println("Soap is available in the shop");
    }

    public static void main(String[] args){

        useSoap();
        buySoap();

        int soapId = 1301;
        String soapName = "Lux";
        String soapType = "Bath Soap";
        int soapPrice = 45;
        double soapWeight = 125.0;
        String soapColor = "Pink";
        String soapFragrance = "Rose";
        String soapBrand = "HUL";
        boolean isAvailable = true;
        String soapShape = "Oval";
        String shopName = "Super Market";
        String location = "Bengaluru";
        int quantity = 200;
        String manufactureDate = "01-08-2026";
        String expiryDate = "01-08-2029";
        double rating = 4.8;
        String skinType = "All Skin Types";
        String purpose = "Bathing";
        String manufacturer = "Hindustan Unilever";
        String ownerName = "Ramesh";

        System.out.println("Soap ID: " + soapId);
        System.out.println("Soap Name: " + soapName);
        System.out.println("Soap Type: " + soapType);
        System.out.println("Soap Price: " + soapPrice);
        System.out.println("Soap Weight: " + soapWeight);
        System.out.println("Soap Color: " + soapColor);
        System.out.println("Soap Fragrance: " + soapFragrance);
        System.out.println("Soap Brand: " + soapBrand);
        System.out.println("Available: " + isAvailable);
        System.out.println("Soap Shape: " + soapShape);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Purpose: " + purpose);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Owner Name: " + ownerName);
    }
}