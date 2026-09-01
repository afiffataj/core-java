class Boat{

    static void startBoat(){
        System.out.println("Boat is started");
    }

    static void stopBoat(){
        System.out.println("Boat is stopped");
		//stopBoat();
    }

    public static void main(String[] args){

        startBoat();
        stopBoat();

        int boatId = 601;
        String boatName = "Speed Boat";
        String boatType = "Motor Boat";
        int boatPrice = 500000;
        double boatLength = 25.5;
        String boatColor = "White";
        String boatMaterial = "Fiber";
        String boatBrand = "Yamaha";
        boolean hasEngine = true;
        String boatShape = "Oval";
        String ownerName = "Ramesh";
        String location = "Goa";
        int seatingCapacity = 8;
        String manufactureDate = "15-07-2025";
        String registrationNumber = "KA01BT1234";
        double boatWeight = 1500.5;
        double rating = 4.8;
        boolean isAvailable = true;
        String fuelType = "Diesel";
        int maxSpeed = 80;

        System.out.println("Boat ID: " + boatId);
        System.out.println("Boat Name: " + boatName);
        System.out.println("Boat Type: " + boatType);
        System.out.println("Boat Price: " + boatPrice);
        System.out.println("Boat Length: " + boatLength);
        System.out.println("Boat Color: " + boatColor);
        System.out.println("Boat Material: " + boatMaterial);
        System.out.println("Boat Brand: " + boatBrand);
        System.out.println("Has Engine: " + hasEngine);
        System.out.println("Boat Shape: " + boatShape);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Boat Weight: " + boatWeight);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}