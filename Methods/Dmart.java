class Dmart{
	public static void main(String[] args){
		//no return type and no parameters
		System.out.println("Is Dmart open today");
        Dmart.isDmartOpenToday();
		System.out.println("Person1 asking is Dmart Open Today");
		Dmart.isDmartOpenToday();
		System.out.println("Person2 asking is Dmart Open Today");
		Dmart.isDmartOpenToday();
	    System.out.println("Person3 asking is Dmart Open Today");
		Dmart.isDmartOpenToday();
		System.out.println();
		
		System.out.println("what is the location of Dmart");
		Dmart.whatIsTheLocationOfDmart();
		System.out.println("Person1 asking what Is The Location Of Dmart");
		Dmart.whatIsTheLocationOfDmart();
		System.out.println("Person2 asking what Is The Location Of Dmart");
		Dmart.whatIsTheLocationOfDmart();
		System.out.println("Person3 asking what Is The Location Of Dmart");
		Dmart.whatIsTheLocationOfDmart();
		System.out.println();

        System.out.println("are grocery open in Dmart");
		Dmart.isGroceryOpen();
		System.out.println("Person1 asking is Grocery Open");
		Dmart.isGroceryOpen();
		System.out.println("Person2 asking is Grocery Open");
		Dmart.isGroceryOpen();
		System.out.println("Person3 asking is Grocery Open");
		Dmart.isGroceryOpen();
		System.out.println();
		
		System.out.println("what Is The Rating Of Dmart");
		Dmart.whatIsTheRatingOfDmart();
		System.out.println("Person1 asking what Is The Rating Of Dmart");
		Dmart.whatIsTheRatingOfDmart();
		System.out.println("Person2 asking what Is The Rating Of Dmart");
		Dmart.whatIsTheRatingOfDmart();
		System.out.println("Person3 asking what Is The Rating Of Dmart");
		Dmart.whatIsTheRatingOfDmart();
		System.out.println();
		
		//return type and no parameters
		System.out.println("what Is The Price Of 1Kg Of Rice");
		int price=Dmart.whatIsThePriceOf1KgOfRice();
		System.out.println(price);
		System.out.println(price);
		System.out.println(price);
		System.out.println();
		
		System.out.println("what Is The Brand Of 1Kg Of Rice");
		System.out.println(Dmart.whatIsTheBrandOf1KgOfRice());
		System.out.println(Dmart.whatIsTheBrandOf1KgOfRice());
		System.out.println(Dmart.whatIsTheBrandOf1KgOfRice());
		System.out.println();		
		
		System.out.println("what Is The Color Of 1Kg Of Rice");
		System.out.println(Dmart.whatIsTheColorOf1KgOfRice());
		System.out.println(Dmart.whatIsTheColorOf1KgOfRice());
		System.out.println(Dmart.whatIsTheColorOf1KgOfRice());
		System.out.println();		
		
		System.out.println("what Is The Discount Of 1Kg Of Rice");
		System.out.println(Dmart.whatIsTheDiscountOf1KgOfRice());
		System.out.println(Dmart.whatIsTheDiscountOf1KgOfRice());
		System.out.println(Dmart.whatIsTheDiscountOf1KgOfRice());
		
	}
    
	static void isDmartOpenToday(){
		System.out.println("Yes the Dmart is open today");
	}
	
	static void whatIsTheLocationOfDmart(){
		System.out.println("The location of Dmart is rajajinagar");
	}
	
	static void isGroceryOpen(){
		System.out.println("Yes the Grocery is open");
	}
	
	static void whatIsTheRatingOfDmart(){
		System.out.println("the rating of dmart is 4.5 stars");
	}
	
	static int whatIsThePriceOf1KgOfRice(){
		int price=500;
		return price;
	}
	
	static String whatIsTheBrandOf1KgOfRice(){
		String brand="Basmati";
		return brand;
	}
	
	static float whatIsTheDiscountOf1KgOfRice(){
		float discount=34.6f;
		return discount;
	}
	
	static String whatIsTheColorOf1KgOfRice(){
		String color="White";
		return color;
	}
}