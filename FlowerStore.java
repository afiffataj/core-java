class FlowerStore {
    public static void store(String name, String color, int quantity,
	double price, String type) {
        System.out.println("Flowers are stored in FlowerStore");
        if(name != null) 
		{
            System.out.println("Flower name is valid");
        }
        if(color == null)
		{
            System.out.println("Flower color is valid");
        }
        if(quantity > 0) 
		{
            System.out.println("Quantity is valid");
        }
        if(price > 0)
		{
            System.out.println("Price is valid");
        }
        if(type == null) 
		{
            System.out.println("Flower type is valid");
        }
    }
}