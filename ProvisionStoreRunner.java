class ProvisionStoreRunner {
    public static void main(String[] args) {
        String item = "Rice";
        int quantity = 10;
        double price = 650.0;
        String brand = null;

        ProvisionStore.store(item, quantity, price, brand);
	}
}