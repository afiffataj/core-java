class WineStore {
    public static void store(String brand, int price, boolean available) {
        System.out.println("Wines are stored in WineStore");
        if(brand != null) 
		{
            System.out.println("Brand is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
        if(available==true) 
		{
            System.out.println("Wine is available");
        }
    }
}