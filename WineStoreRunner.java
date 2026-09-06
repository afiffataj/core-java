class WineStoreRunner {
    public static void main(String[] args) {
        String brand = "Kingfisher";
        int price = 250;
        boolean available = true;

        WineStore.store(brand, price, available);

        WineStore.store(null, -90, false);
		WineStore.store("la marca",500,false);
    }
}