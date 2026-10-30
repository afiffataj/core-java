class Torch{
	public static void main(String[] args){
		
		System.out.println("is the torch available in store");
		Torch.isTorchAvailable();
		
		System.out.println("the brand of the torch is");
		String brand=Torch.theBrandOfTorch();
		System.out.println(brand);
		
		System.out.println("the price of torch");
		int a = 477;
		Torch.thePriceOfTorch(a);
		
		System.out.println("the color of the torch");
		String color="White";
		Torch.theColorOfTheTorch(color);
		
	}
	static void isTorchAvailable(){
		System.out.println("Yes the torch is available");
	}
	
	static String theBrandOfTorch(){
		String brand="Usha";
		return brand;
	}
	
	static void thePriceOfTorch(int a){
		System.out.println(a);
	}
	
	static String theColorOfTheTorch(String c){
		System.out.println(c);
		return c;
	}
}