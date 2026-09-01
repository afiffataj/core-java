class FancyStore{
	public static void store(String item,double cost,int quantity,
	String color){
		System.out.println("running store in the fancystore");
		if(item==null)
		{
			System.out.println("item is invalid");
		}
		if(cost>=0)
		{
			System.out.println("cost is valid");
		}
		if(quantity>0)
		{
			System.out.println("quantity is valid");
		}
		if(color==null)
		{
			System.out.println("color is invalid");
		}
	}
}