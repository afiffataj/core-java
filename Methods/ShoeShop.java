class ShoeShop{
	public static void main(String[] args){
		
		System.out.println("is puma brand available");
		boolean isAvailable=ShoeShop.isPumaBrandAvailable();
		System.out.println(isAvailable);
		
		System.out.println("the price of puma shoes");
		int price=ShoeShop.thePriceOfPumaShoes();
		System.out.println(price);
		
		System.out.println("the color of puma shoes");
		String color=ShoeShop.theColorOfPumaShoes();
		System.out.println(color);
		
		System.out.println("the size of puma shoes");
		char size=ShoeShop.theSizeOfPumaShoes();
		System.out.println(size);
		
		System.out.println("the length of puma shoes");
		float length=ShoeShop.theLengthOfPumaShoes();
		System.out.println(length);
		
	}
	static boolean isPumaBrandAvailable(){
		boolean isAvailable=true;
		return isAvailable;
	}
	
	static int thePriceOfPumaShoes(){
		int price=25000;
		return price;
	}
	
	static String theColorOfPumaShoes(){
		String color="Blue";
		return color;
	}
	
	static char theSizeOfPumaShoes(){
		char size='L';
		return size;
	}
	
	static float theLengthOfPumaShoes(){
		float length=55.8f;
		return length;
	}
}