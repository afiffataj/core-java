class LipstickShopping{
	public static void main(String[] args){
		
		System.out.println("the price of lipstick");
		int price=LipstickShopping.thePriceOfLipstick();
		System.out.println(price);
		
		System.out.println("the brand of lipstick");
		System.out.println(LipstickShopping.theBrandOfLipstick());
		
		System.out.println("the no of quantity of lipstick");
		byte noOfQuantity=LipstickShopping.theQuantityOfLipstick();
		System.out.println(noOfQuantity);
		
		System.out.println("the color of lipstick");
		String color=LipstickShopping.theColorOfLipstick();
		System.out.println(color);
		
		System.out.println("the weight of lipstick");
		double weight=LipstickShopping.theWeightOfLipstick();
		System.out.println(weight);
		
	}
	
	static int thePriceOfLipstick(){
		int price=546;
		return price;
	}
	
	static String theBrandOfLipstick(){
		String brand="Swiss Beauty";
		return brand;
	}
	
	static byte theQuantityOfLipstick(){
		byte noOfQuantity=4;
		return noOfQuantity;
	}
	
	static String theColorOfLipstick(){
		String color="Brown";
		return color;
	}
	
	static double theWeightOfLipstick(){
		double weight=3.8d;
		return weight;
	}
}