class JewelleryStore {
    public static void store(String item, String type, double weight,
	double price, String color,boolean hallmark, int quantity) {
        System.out.println("Jewellery is stored in JewelleryStore");
        if(item != null) 
		{
            System.out.println("Item is valid");
        }
        if(type != null) 
		{
            System.out.println("Type is valid");
        }
        if(weight > 0) 
		{
            System.out.println("Weight is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
        if(color != null) 
		{
            System.out.println("Color is valid");
        }

        if(hallmark==true) {
            System.out.println("Hallmark is valid");
        }
        if(quantity > 0) 
		{
            System.out.println("Quantity is valid");
        }
    }
}