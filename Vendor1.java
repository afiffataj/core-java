class Vendor1{
	public static void acceptOrder(String product,int quantity,double price){
		System.out.println("running acceptOrder in vendor");
		System.out.println("product="+product);
		System.out.println("quantity="+quantity);
		System.out.println("price="+price);
		
		//blush=140 and commission=10
		//eyeliner=100 and commission=5
		
		if(quantity > 0 && quantity <= 10)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is invalid");
			return;
		}
		
		if(price < 0)
		{
			System.out.println("price is In-valid");
			return;
		}
		else
		{
			System.out.println("price is valid");
			
		}
		
		int blushCommission=10;
		if(product == "blush")
		{
			double blushProduct=price+blushCommission;
			double totalPrice=quantity*blushProduct;
			System.out.println("totalPrice="+totalPrice);
		}
		
		int eyelinerCommission=5;
		if(product == "Eyeliner")
		{
			double eyelinerProduct=price+eyelinerCommission;
			double totalPrice=quantity*eyelinerProduct;
			System.out.println("totalPrice="+totalPrice);
		}
	}
}