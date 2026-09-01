class Flower{

    static void bloomFlower(){
        System.out.println("Flower is blooming");
		//bloomFlower();
    }

    static void smellFlower(){
        System.out.println("Flower has a sweet fragrance");
    }

    public static void main(String[] args){

        bloomFlower();
        smellFlower();

        int flowerId = 801;
        String flowerName = "Rose";
        String flowerType = "Natural";
        int flowerPrice = 50;
        double flowerWeight = 20.5;
        String flowerColor = "Red";
        String flowerSmell = "Sweet";
        String flowerSeason = "Spring";
        boolean isFresh = true;
        String flowerShape = "Round";
        String shopName = "Flower Garden";
        String location = "Bengaluru";
        String flowerBrand = "Nature";
        int quantity = 100;
        String pluckDate = "02-08-2026";
        String expiryDate = "05-08-2026";
        double rating = 4.9;
        boolean isAvailable = true;
        String ownerName = "Ramesh";
        String purpose = "Decoration";

        System.out.println("Flower ID: " + flowerId);
        System.out.println("Flower Name: " + flowerName);
        System.out.println("Flower Type: " + flowerType);
        System.out.println("Flower Price: " + flowerPrice);
        System.out.println("Flower Weight: " + flowerWeight);
        System.out.println("Flower Color: " + flowerColor);
        System.out.println("Flower Smell: " + flowerSmell);
        System.out.println("Flower Season: " + flowerSeason);
        System.out.println("Is Fresh: " + isFresh);
        System.out.println("Flower Shape: " + flowerShape);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Location: " + location);
        System.out.println("Flower Brand: " + flowerBrand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Pluck Date: " + pluckDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Purpose: " + purpose);
    }
}