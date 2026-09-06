class Train1{

    static void startTrain(){
        System.out.println("Train is starting");
		//startTrain();
    }

    static void stopTrain(){
        System.out.println("Train is stopped");
    }

    public static void main(String[] args){

        startTrain();
        stopTrain();

        int trainId = 1101;
        String trainName = "Vande Bharat";
        String trainType = "Express";
        int trainPrice = 15000000;
        double trainLength = 384.5;
        String trainColor = "White";
        String trainEngine = "Electric";
        String trainBrand = "Indian Railways";
        boolean hasAC = true;
        String trainRoute = "Bengaluru to Mysuru";
        String stationName = "KSR Bengaluru";
        String destination = "Mysuru";
        int coachCount = 16;
        String departureTime = "06:00 AM";
        String arrivalTime = "08:30 AM";
        double rating = 4.9;
        boolean isAvailable = true;
        int passengerCapacity = 1128;
        String driverName = "Ramesh";
        int trainSpeed = 160;

        System.out.println("Train ID: " + trainId);
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Type: " + trainType);
        System.out.println("Train Price: " + trainPrice);
        System.out.println("Train Length: " + trainLength);
        System.out.println("Train Color: " + trainColor);
        System.out.println("Train Engine: " + trainEngine);
        System.out.println("Train Brand: " + trainBrand);
        System.out.println("Has AC: " + hasAC);
        System.out.println("Train Route: " + trainRoute);
        System.out.println("Station Name: " + stationName);
        System.out.println("Destination: " + destination);
        System.out.println("Coach Count: " + coachCount);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Train Speed: " + trainSpeed);
    }
}