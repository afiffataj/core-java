class Fuel{

    static void fillFuel(){
        System.out.println("Fuel tank is filled");
		//fillFuel();
    }

    static void useFuel(){
        System.out.println("Fuel is used by the vehicle");
    }

    public static void main(String[] args){

        fillFuel();
        useFuel();

        int fuelId = 1201;
        String fuelName = "Petrol";
        String fuelType = "Liquid";
        int fuelPrice = 105;
        double fuelQuantity = 50.0;
        String fuelColor = "Light Yellow";
        String fuelBrand = "Indian Oil";
        String fuelGrade = "Premium";
        boolean isAvailable = true;
        String fuelQuality = "High";
        String stationName = "Indian Oil Petrol Pump";
        String location = "Bengaluru";
        int tankCapacity = 5000;
        String manufactureDate = "01-08-2026";
        String expiryDate = "01-08-2027";
        double rating = 4.7;
        String vehicleType = "Car";
        String fuelUnit = "Litres";
        String supplierName = "Indian Oil";
        String ownerName = "Ramesh";

        System.out.println("Fuel ID: " + fuelId);
        System.out.println("Fuel Name: " + fuelName);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Fuel Price: " + fuelPrice);
        System.out.println("Fuel Quantity: " + fuelQuantity);
        System.out.println("Fuel Color: " + fuelColor);
        System.out.println("Fuel Brand: " + fuelBrand);
        System.out.println("Fuel Grade: " + fuelGrade);
        System.out.println("Available: " + isAvailable);
        System.out.println("Fuel Quality: " + fuelQuality);
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Tank Capacity: " + tankCapacity);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Rating: " + rating);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fuel Unit: " + fuelUnit);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Owner Name: " + ownerName);
    }
}