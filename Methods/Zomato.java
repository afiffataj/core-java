class Zomato{
	public static void main(String[] args){
		
		System.out.println("is Zomato app available");
		System.out.println(Zomato.isZomatoAppAvailable());
		System.out.println(Zomato.isZomatoAppAvailable());
		System.out.println(Zomato.isZomatoAppAvailable());
		System.out.println(Zomato.isZomatoAppAvailable());
		
		System.out.println("does zomato has burger");
		System.out.println(Zomato.doesZomatoHasBurger());
		System.out.println(Zomato.doesZomatoHasBurger());
		System.out.println(Zomato.doesZomatoHasBurger());
		System.out.println(Zomato.doesZomatoHasBurger());
		
		System.out.println("the price Of Zomato Burger");
		System.out.println(Zomato.priceOfZomatoBurger());
		System.out.println(Zomato.priceOfZomatoBurger());
		System.out.println(Zomato.priceOfZomatoBurger());
		System.out.println(Zomato.priceOfZomatoBurger());
	}
	
	static boolean isZomatoAppAvailable(){
		boolean isAvailable=true;
		return isAvailable;
	}
	
	static boolean doesZomatoHasBurger(){
		boolean burgerAvailable=true;
		return burgerAvailable;
	}
	
	static int priceOfZomatoBurger(){
		int price=499;
		return price;
	}
}