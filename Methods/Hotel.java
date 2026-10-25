class Hotel {
    public static void main(String[] args) {

        System.out.println("Is hotel open");
        Hotel.isHotelOpen();
        Hotel.isHotelOpen();
        Hotel.isHotelOpen();

        System.out.println("Is room service available");
        Hotel.isRoomServiceAvailable();
        Hotel.isRoomServiceAvailable();
        Hotel.isRoomServiceAvailable();

        System.out.println("Is Wi-Fi available");
        Hotel.isWifiAvailable();
        Hotel.isWifiAvailable();
        Hotel.isWifiAvailable();

        System.out.println("Is parking available");
        Hotel.isParkingAvailable();
        Hotel.isParkingAvailable();
        Hotel.isParkingAvailable();

        System.out.println("Hotel name");
        System.out.println(Hotel.getHotelName());
        System.out.println(Hotel.getHotelName());
        System.out.println(Hotel.getHotelName());

        System.out.println("Room price");
        System.out.println(Hotel.getRoomPrice());
        System.out.println(Hotel.getRoomPrice());
        System.out.println(Hotel.getRoomPrice());

        System.out.println("Number of rooms");
        System.out.println(Hotel.getNumberOfRooms());
        System.out.println(Hotel.getNumberOfRooms());
        System.out.println(Hotel.getNumberOfRooms());

        System.out.println("Hotel location");
        System.out.println(Hotel.getHotelLocation());
        System.out.println(Hotel.getHotelLocation());
        System.out.println(Hotel.getHotelLocation());
    }

    static void isHotelOpen() {
        System.out.println("Yes, the hotel is open");
    }

    static void isRoomServiceAvailable() {
        System.out.println("Yes, room service is available");
    }

    static void isWifiAvailable() {
        System.out.println("Yes, Wi-Fi is available");
    }

    static void isParkingAvailable() {
        System.out.println("Yes, parking is available");
    }

    static String getHotelName() {
        return "Grand Palace";
    }

    static int getRoomPrice() {
        return 2500;
    }

    static int getNumberOfRooms() {
        return 50;
    }

    static String getHotelLocation() {
        return "Bengaluru";
    }
}