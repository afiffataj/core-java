class Drone {
    public static void main(String[] args) {

        System.out.println("the price of drone");
        long price = Drone.dronePrice();
        System.out.println(price);

        System.out.println("the brand of drone");
        System.out.println(Drone.droneBrand());

        System.out.println("the quantity of drone");
        byte quantity = Drone.droneQuantity();
        System.out.println(quantity);

        System.out.println("the weight of drone");
        double weight = Drone.droneWeight();
        System.out.println(weight);

        System.out.println("the flight time of drone");
        float flightTime = Drone.droneFlightTime();
        System.out.println(flightTime);

        System.out.println("is drone rechargeable");
        boolean rechargeable = Drone.droneRechargeable();
        System.out.println(rechargeable);

        System.out.println("the drone color code");
        char color = Drone.droneColor();
        System.out.println(color);
    }

    static long dronePrice() {
        return 35000L;
    }

    static String droneBrand() {
        return "DJI";
    }

    static byte droneQuantity() {
        return 2;
    }

    static double droneWeight() {
        return 0.570d;
    }

    static float droneFlightTime() {
        return 31.5f;
    }

    static boolean droneRechargeable() {
        return true;
    }

    static char droneColor() {
        return 'G';
    }
}