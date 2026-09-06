class Aquarium{

    static void fillWater(){
        System.out.println("Aquarium is filled with water");
   //fillWater(); 
	}

    static void addFish(){
        System.out.println("Fish are added to the aquarium");
    }

    public static void main(String[] args){

        fillWater();
        addFish();

        int aquariumId = 401;
        String aquariumName = "Ocean Tank";
        String aquariumType = "Fresh Water";
        int aquariumPrice = 5000;
        double aquariumLength = 120.5;
        String aquariumColor = "Transparent";
        String aquariumMaterial = "Glass";
        String fishType = "Gold Fish";
        boolean hasLight = true;
        String aquariumShape = "Rectangle";
        String shopName = "Aqua World";
        String location = "Bengaluru";
        String brand = "AquaLife";
        int fishCount = 15;
        String purchaseDate = "02-08-2026";
        String cleaningDate = "10-08-2026";
        double rating = 4.7;
        boolean isAvailable = true;
        String ownerName = "Ramesh";
        String filterType = "Bio Filter";

        System.out.println("Aquarium ID: " + aquariumId);
        System.out.println("Aquarium Name: " + aquariumName);
        System.out.println("Aquarium Type: " + aquariumType);
        System.out.println("Aquarium Price: " + aquariumPrice);
        System.out.println("Aquarium Length: " + aquariumLength);
        System.out.println("Aquarium Color: " + aquariumColor);
        System.out.println("Aquarium Material: " + aquariumMaterial);
        System.out.println("Fish Type: " + fishType);
        System.out.println("Has Light: " + hasLight);
        System.out.println("Aquarium Shape: " + aquariumShape);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Brand: " + brand);
        System.out.println("Fish Count: " + fishCount);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Cleaning Date: " + cleaningDate);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Filter Type: " + filterType);
    }
}