class Table{
	static String color="Cream";
	static byte noOfLegs=4;
	static boolean isAvailable=true;
	static char size='M';
	
	public static void main(String[] args){
		int price=899;
		String brand="Popular";
		byte discount=55;
		double length=77.7d;

	System.out.println("color of table="+Table.color);
	System.out.println("noOfLegs of table="+Table.noOfLegs);
	System.out.println("is the table available="+Table.isAvailable);
	System.out.println("the size of table="+Table.size);
	System.out.println("the price of table="+price);
	System.out.println("the brand of table="+brand);
	System.out.println("the discount for table="+discount);
	System.out.println("the length of table="+length);
	
	Table.theTableShopIsAvailableIn();
	Table.theTableShopOpen();
	Table.theTableShopOwnerAvailable();
	
	System.out.println("the color of Shop");
	String color=Table.theColorOfShop();
	System.out.println(color);
	
	System.out.println("the weight of table");
	byte weight=Table.theWeightOfTable();
	System.out.println(weight);
	
	System.out.println("the phoneNo of the shop owner");
	long phoneNo=Table.thePhoneNoOfOwner();
	System.out.println(phoneNo);
	
	}
	
	static void theTableShopIsAvailableIn(){
		System.out.println("the table shop is in rajajinagar");
	}
	
	static void theTableShopOpen(){
		System.out.println("Yes the table shop is open");
	}
	
	static void theTableShopOwnerAvailable(){
		System.out.println("Yes the ower of table shop is available");
	}
	
	static String theColorOfShop(){
		String color="Blue";
		return color;
	}
	
	static byte theWeightOfTable(){
		byte weight=45;
		return weight;
	}
	
	static long thePhoneNoOfOwner(){
		long phoneNo=9880974777l;
		return phoneNo;
	}
	
}
	