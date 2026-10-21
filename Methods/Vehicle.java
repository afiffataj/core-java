class Vehicle {
    public static void main(String[] args) {

        System.out.println("Are the vehicle names available");

        String vehicleName = "Car";
        String vehicleName1 = "Bike";

        Vehicle.areTheVehicleNamesAvailable(
            vehicleName, vehicleName1
        );
    }

    static void areTheVehicleNamesAvailable(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}