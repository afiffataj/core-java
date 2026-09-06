class MobileStore {
    public static void store(String brand, String model, int price,
	String color) {
        System.out.println("mobile are store in mobilestore");
		if(brand == null) 
		{
            System.out.println("Brand is valid");
        }
        if(model == null) 
		{
            System.out.println("Model is valid");
        }
        if(price > 0) 
		{
            System.out.println("Price is valid");
        }
        if(color != null) 
		{
            System.out.println("Color is valid");
        }
    }
}