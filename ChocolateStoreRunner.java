class ChocolateStoreRunner {
    public static void main(String[] args) {
        String name = "Dairy Milk";
        int price = 100;

        ChocolateStore.store(name, price);

        ChocolateStore.store(null, -100);
		ChocolateStore.store("kitkat",0);
    }
}