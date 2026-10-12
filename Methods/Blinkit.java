class Blinkit{
	public static void main(String[] args){
		
		System.out.println("What is the price of 1 biscuit");
		int price=Blinkit.whatIsThePriceOf1Biscuit();
		System.out.println(price);
		
		System.out.println("What is the price of 2 biscuit");
		int sum=12*Blinkit.whatIsThePriceOf1Biscuit();
		System.out.println(sum);
		
		int priceOfBiscuit1=45;
		int priceOfBiscuit2=37;
		int priceOfBiscuit3=55;
		int priceOfBiscuit4=40;
		Blinkit.priceOfBiscuit(priceOfBiscuit1,priceOfBiscuit2,priceOfBiscuit3,priceOfBiscuit4);
		
		char sizeOfBiscuit1='4';
		char sizeOfBiscuit2='8';
		char sizeOfBiscuit3='7';
		Blinkit.sizeOfBiscuit(sizeOfBiscuit1,sizeOfBiscuit2,sizeOfBiscuit3);
		
	}
	
	static int whatIsThePriceOf1Biscuit(){
		int price=60;
		return price;
	}
	
	static int whatIsThePriceOf2Biscuit(){
		return 60;
	}
	
	static void priceOfBiscuit(int a,int b,int c,int d){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
		
	static void sizeOfBiscuit(char a,char b,char c){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		
}