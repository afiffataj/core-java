class Terrace{

    static void openTerrace(){
        System.out.println("Terrace is open");
    }

    static void closeTerrace(){
        System.out.println("Terrace is closed");
    }

    public static void main(String[] args){

        openTerrace();
        closeTerrace();

        int terraceId = 201;
        String terraceName = "Sky View Terrace";
        String terraceType = "Open";
        int terraceArea = 1200;
        double terraceHeight = 35.5;
        String terraceColor = "White";
        String terraceFloor = "Tiles";
        String terraceShape = "Rectangle";
        boolean hasGarden = true;
        String terraceLocation = "Bengaluru";
        String buildingName = "Sunshine Apartments";
        int floorNumber = 10;
        String ownerName = "Ramesh";
        int capacity = 100;
        String constructionDate = "10-05-2020";
        String maintenanceDate = "01-08-2026";
        double rent = 5000.0;
        boolean isAvailable = true;
        String purpose = "Party";
        String direction = "East";

        System.out.println("Terrace ID: " + terraceId);
        System.out.println("Terrace Name: " + terraceName);
        System.out.println("Terrace Type: " + terraceType);
        System.out.println("Terrace Area: " + terraceArea);
        System.out.println("Terrace Height: " + terraceHeight);
        System.out.println("Terrace Color: " + terraceColor);
        System.out.println("Terrace Floor: " + terraceFloor);
        System.out.println("Terrace Shape: " + terraceShape);
        System.out.println("Has Garden: " + hasGarden);
        System.out.println("Terrace Location: " + terraceLocation);
        System.out.println("Building Name: " + buildingName);
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Construction Date: " + constructionDate);
        System.out.println("Maintenance Date: " + maintenanceDate);
        System.out.println("Rent: " + rent);
        System.out.println("Available: " + isAvailable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Direction: " + direction);
    }
}