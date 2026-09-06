class DryFruitStore {
    public static void store(String name, int quantity, double price) {
        System.out.println("Dry fruits are stored in DryFruitStore");
        if(name == null) 
		{
            System.out.println("Dry fruit name is valid");
        }
        if(quantity > 0) 
		{
            System.out.println("Quantity is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
    }
}