class Zepto{
	public static void order(String product,int quantity,double price){
		System.out.println("running order in zepto");
		System.out.println("product="+product);
		System.out.println("quantity="+quantity);
		System.out.println("price="+price);
		
		if(quantity > 0 && quantity <= 10)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is invalid");
			return;
		}
		
		if(product == "blush")
		{
			Vendor1.acceptOrder(product,quantity,price);
		}
		else if(product == "Eyeliner")
		{
			Vendor1.acceptOrder(product,quantity,price);
		}
		
	}
}