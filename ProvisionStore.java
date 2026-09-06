class ProvisionStore {
    public static void store(String item, int quantity, double price, String brand) {
        System.out.println("Items are stored in ProvisionStore");
        if(item != null) 
		{
            System.out.println("Item is valid");
        }
        if(quantity > 0) 
		{
            System.out.println("Quantity is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
        if(brand != null) 
		{
            System.out.println("Brand is valid");
        }
    }
}