class AmazonShopping{
	public static void main(String[] args){
		
		System.out.println("in Amazon App is rice avaiable");
		boolean isAvailable=AmazonShopping.isRiceAvailable();
		System.out.println(isAvailable);
		
		System.out.println("the name of rice in amazon app");
		System.out.println(AmazonShopping.riceType());
		
		System.out.println("the price of rice in amazon app");
		System.out.println(AmazonShopping.ricePrice());
		
		System.out.println("the color of basmatiRice in amazon app");
		System.out.println(AmazonShopping.riceColor());
	}
	
	static boolean isRiceAvailable(){
		boolean isAvailable=true;
		return isAvailable;
	}
	
	static String riceType(){
		String riceName="Basmati";
		return riceName;
	}
	
	static int ricePrice(){
		int ricePrice=400;
		return ricePrice;
	}
	static String riceColor(){
		String riceColor="White";
		return riceColor;
	}
}