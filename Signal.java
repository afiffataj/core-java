class Signal{

    static void redSignal(){
        System.out.println("Stop at Red Signal");
		//redSignal();
    }

    static void greenSignal(){
        System.out.println("Go at Green Signal");
		//greenSignal();
    }

    public static void main(String[] args){

        redSignal();
        greenSignal();

        int signalId = 701;
        String signalName = "Traffic Signal";
        String signalType = "Automatic";
        int signalPrice = 25000;
        double signalHeight = 12.5;
        String signalColor = "Red, Yellow, Green";
        String signalMaterial = "Metal";
        String signalBrand = "TrafficTech";
        boolean isWorking = true;
        String signalShape = "Vertical";
        String location = "Bengaluru";
        String roadName = "MG Road";
        int poleNumber = 15;
        String installationDate = "15-06-2025";
        String maintenanceDate = "01-08-2026";
        double rating = 4.9;
        boolean isAutomatic = true;
        String powerSource = "Electric";
        int timer = 60;
        String controller = "Smart Controller";

        System.out.println("Signal ID: " + signalId);
        System.out.println("Signal Name: " + signalName);
        System.out.println("Signal Type: " + signalType);
        System.out.println("Signal Price: " + signalPrice);
        System.out.println("Signal Height: " + signalHeight);
        System.out.println("Signal Color: " + signalColor);
        System.out.println("Signal Material: " + signalMaterial);
        System.out.println("Signal Brand: " + signalBrand);
        System.out.println("Working: " + isWorking);
        System.out.println("Signal Shape: " + signalShape);
        System.out.println("Location: " + location);
        System.out.println("Road Name: " + roadName);
        System.out.println("Pole Number: " + poleNumber);
        System.out.println("Installation Date: " + installationDate);
        System.out.println("Maintenance Date: " + maintenanceDate);
        System.out.println("Rating: " + rating);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Timer: " + timer);
        System.out.println("Controller: " + controller);
    }
}