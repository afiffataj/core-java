class DryFruitStoreRunner {
    public static void main(String[] args) {
        String name = "Almond";
        int quantity = 5;
        double price = 850.0;

        DryFruitStore.store(name, quantity, price);

        DryFruitStore.store(null, 0, -900);
		DryFruitStore.store("cashew",10,1000);
    }
}