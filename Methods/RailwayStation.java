class RailwayStation {
    public static void main(String[] args) {

        System.out.println("Railway Station Details");

        long trainNumber = 123456L;
        long trainNumber1 = 654321L;

        RailwayStation.printTrainNumbers(trainNumber, trainNumber1);
        RailwayStation.printStationNames("Bengaluru", "Chennai");
    }

    static void printTrainNumbers(long a, long b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printStationNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}