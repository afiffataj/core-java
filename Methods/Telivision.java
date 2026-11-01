class Telivision{
	public static void main(String[] args){
		
		System.out.println("Is Telivision shop open");
		Telivision.isTelivisionShopOpen();
		
		System.out.println("Is the owner of Telivision shop present");
		Telivision.isTheOwnerAvailable();
		
		System.out.println("The size of Telivision");
		char size=Telivision.theSizeOfTelivision();
		System.out.println(size);
		
		System.out.println("Are all sizes Available");
		boolean allSize=Telivision.areAllSizesAvailable();
		System.out.println(allSize);
		
		System.out.println("The Brand Of Telivision");
		String brand="Sony";
		Telivision.theBrandOfTelivision(brand);
		
		System.out.println("The discount of Telivision");
		int discount=34;
		int discount1=56;
		Telivision.theDiscountOfTelivision(discount,discount1);
		
		System.out.println("The Color Of Telivision");
		String color="Black";
		String color1="Blue";
		String color2="White";
		Telivision.theColorOfTelivision(color,color1,color2);
		
		System.out.println("The Length Of Telivision");
		float length=45.5f;
		Telivision.theLengthOfTelivision(length);
		
		System.out.println("The Weight of Telivision");
		double weight=55.8d;
		double weight1=98.8d;
		Telivision.theWeightOfTelivision(weight,weight1);
		
		System.out.println("The Price Of Telivision");
		int price=3456;
		int price1=6543;
		int price2=4534;
		Telivision.thePriceOfTelivision(price,price1,price2);
	}
	static void isTelivisionShopOpen(){
		System.out.println("Yes Telivision shop is open");
	}
	
	static void isTheOwnerAvailable(){
		System.out.println("Yes the owner is available");
	}
	
	static char theSizeOfTelivision(){
		char size='l';
		return size;
	}
	
	static boolean areAllSizesAvailable(){
		boolean allSize=true;
		return allSize;
	}
	
	static void theBrandOfTelivision(String a){
		System.out.println(a);
	}
	
	static void theDiscountOfTelivision(int b,int c){
		System.out.println(b);
		System.out.println(c);
	}
	
	static void theColorOfTelivision(String s,String r,String h){
		System.out.println(s);
		System.out.println(r);
		System.out.println(h);
	}
	
	static float theLengthOfTelivision(float t){
		System.out.println(t);
		return t;
	}
	
	static double theWeightOfTelivision(double i,double j){
		System.out.println(i);
		System.out.println(j);
		return j;
	}
	
	static int thePriceOfTelivision(int h,int y,int z){
		System.out.println(h);
		System.out.println(y);
		System.out.println(z);
		return y;
	}
}
		