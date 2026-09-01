class FishShop{
	public static void sell(String fishName,int quantity,double price){
		System.out.println("fishName="+fishName);
		System.out.println("quantity="+quantity);
		System.out.println("price="+price);
		if(fishName==null || quantity<=0 || quantity>100 || price<=0)
		{
			System.out.println("invalid data");
		}
		else 
		{
		    System.out.println("valid data");
	}
}
}