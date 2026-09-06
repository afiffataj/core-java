class FlowerStoreRunner {
    public static void main(String[] args) {
        String name = null;
        String color = "Red";
        int quantity = 20;
        double price = 150.0;
        String type = "Rose";

        FlowerStore.store(name, color, quantity, price, type);

        FlowerStore.store("ahmedflower", null, 0, 0.0, null);
    }
}