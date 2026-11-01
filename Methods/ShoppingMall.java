class ShoppingMall{
	public static void main(String[] args){
		
		System.out.println("Is The shopping mall open");
		ShoppingMall.isTheShoppingMallOpen();
		
		System.out.println("Is the security guard available");
		ShoppingMall.isTheSecurityGuardAvailable();
		
		System.out.println("Return The Mall Floor Number");
		char floorNumber=ShoppingMall.returnTheMallFloorNumber();
		System.out.println(floorNumber);
		
		System.out.println("Are All Shops Avaiable");
		boolean shopsAvailable=ShoppingMall.areAllShopsAvaiable();
		System.out.println(shopsAvailable);
		
		System.out.println("Display Mall Name");
		String mallName="GT mall";
		ShoppingMall.displayMallName(mallName);
		
		System.out.println("Display Two Shop Rents");
		int shopRents=4500;
		int shopRents1=5455;
		ShoppingMall.displayTwoShopRents(shopRents,shopRents1);
		
		System.out.println("Display Three Shop Names");
		String shopName="Sapna Books";
		String shopName1="Rustom";
		String shopName2="Raj";
		ShoppingMall.displayThreeShopNames(shopName,shopName1,shopName2);
		
		System.out.println("Display Mall Height");
		float mallHeight=200.6f;
		ShoppingMall.displayMallHeight(mallHeight);
		
		System.out.println("Display Two Shop Areas");
		double shopArea=78.9d;
		double shopArea1=99.0d;
		ShoppingMall.displayTwoShopAreas(shopArea,shopArea1);
		
		System.out.println("Display Three Parking Numbers");
		int parkingNumber=4;
		int parkingNumber1=9;
		int parkingNumber2=6;
		ShoppingMall.displayThreeParkingNumbers(parkingNumber,parkingNumber1,parkingNumber2);
	}
	static void isTheShoppingMallOpen(){
		System.out.println("Yes the shopping mall is available");
	}
	
	static void isTheSecurityGuardAvailable(){
		System.out.println("Yes the security guard is available");
	}
	
	static char returnTheMallFloorNumber(){
		char floorNumber='4';
		return floorNumber;
	}
	
	static boolean areAllShopsAvaiable(){
		boolean shopsAvailable=false;
		return shopsAvailable;
	}
	
	static void displayMallName(String a){
		System.out.println(a);
	}
	
	static void displayTwoShopRents(int s,int w){
		System.out.println(s);
		System.out.println(w);
	}
	
	static void displayThreeShopNames(String e,String r,String y){
		System.out.println(e);
		System.out.println(r);
		System.out.println(y);
	}
	
	static float displayMallHeight(float s){
		System.out.println(s);
		return s;
	}
	
	static double displayTwoShopAreas(double j,double u){
		System.out.println(j);
		System.out.println(u);
        return u;
	}
	
	static int displayThreeParkingNumbers(int r,int d,int c){
		System.out.println(r);
		System.out.println(d);
		System.out.println(c);
		return d;
	}
}
	