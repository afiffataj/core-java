class JewelleryStoreRunner {
    public static void main(String[] args) {
        String item = "Ring";
        String type = "Gold";
        double weight = 10.5;
        double price = 75000.0;
        String color = "Yellow";
        boolean hallmark = true;
        int quantity = 2;

        JewelleryStore.store(item, type, weight, price, color, hallmark,
		quantity);

        JewelleryStore.store(null, null, 0.0, 0.0, null, false, 0);
    }
}