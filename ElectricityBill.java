class ElectricityBill{
	public static void electricityCompanyName(String companyName,String customerName,
	int unitConsumed,double totalBill){
		System.out.println("running electricityCompanyName in ElectricityBill");
		System.out.println("companyName="+companyName);
		System.out.println("customerName="+customerName);
		System.out.println("unitConsumed="+unitConsumed);
		System.out.println("totalBill="+totalBill);
	
	int bill;
	if(unitConsumed <= 100)
	{
		bill = unitConsumed*5;
	}
	else if(unitConsumed<= 200)
	{
		bill = unitConsumed*7;
	}
	else 
	{
		bill = unitConsumed*10;
	}
	
		
	}
}