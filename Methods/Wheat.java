class Wheat{
	public static void main(String[] args){
		
		System.out.println("Is wheat available");
		boolean isAvailable=Wheat.isWheatAvailableInShop();
		System.out.println(isAvailable);
		
		System.out.println("the price of 1KG of wheat");
		int price=Wheat.thePriceOf1kgOfWheat();
		System.out.println(price);
		
		System.out.println("the brand of wheat");
		String brand=Wheat.theBrandOfWheat();
		System.out.println(brand);
		
		System.out.println("the size of wheat");
		char size=Wheat.theSizeOfWheat();
		System.out.println(size);
	}
	static boolean isWheatAvailableInShop(){
		boolean isAvailable=true;
		return isAvailable;
	}
	
	static int thePriceOf1kgOfWheat(){
		int price=480;
		return price;
	}
	
	static String theBrandOfWheat(){
		String brand="Ashirvad";
		return brand;
	}
	
	static char theSizeOfWheat(){
		char size='M';
		return size;
	}
}
