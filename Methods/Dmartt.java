class Dmartt{
	public static void main(String[] args){
		
		System.out.println("is dmartt open");
		Dmartt.isDmarttOpen();
		
		System.out.println("is the manager of dmartt present");
		Dmartt.isTheManagerOfDmarttPresent();
		
		System.out.println("Return the size of the shopping bag");
		char size=Dmartt.returnTheSizeOfTheShoppingBag();
		System.out.println(size);
		
		System.out.println("Are All Products Avaiable");
		boolean productAvaiable=Dmartt.areAllProductsAvaiable();
		System.out.println(productAvaiable);
		
		System.out.println("display The Name Of Dmartt");
		Dmartt.displayTheNameOfDmartt("rajajinagar");
		
		System.out.println("display Two Product Prices");
		Dmartt.displayTwoProductPrices(3555,9877);
		
		System.out.println("display Three Product Names");
		Dmartt.displayThreeProductNames("Juice","Ice","Panner");
		
		System.out.println("the Weight Of A Rice Bag");
		float weight=Dmartt.theWeightOfARiceBag(45.6f);
		Dmartt.theWeightOfARiceBag(weight);
		
		System.out.println("display Two Product weights");
		double product=Dmartt.displayTwoProductweights(76.9,87);
		System.out.println(product);
		
		System.out.println("display Three Product Quantities");
		int quantities=Dmartt.displayThreeProductQuantities(45,90,88);
		System.out.println(quantities);
	}
	static void isDmarttOpen(){
		System.out.println("Yes Dmartt is open");
	}
	
	static void isTheManagerOfDmarttPresent(){
		System.out.println("Yes the manager of dmartt present");
	}
	
	static char returnTheSizeOfTheShoppingBag(){
		char size='M';
		return size;
	}
	
	static boolean areAllProductsAvaiable(){
		boolean productAvaiable=true;
		return productAvaiable;
	}
	
	static void displayTheNameOfDmartt(String a){
		System.out.println(a);
	}
	
	static void displayTwoProductPrices(int b,int g){
		System.out.println(b);
		System.out.println(g);
	}
	
	static void displayThreeProductNames(String d,String o,String m){
		System.out.println(d);
		System.out.println(o);
		System.out.println(m);
	}
	
     static float theWeightOfARiceBag(float w){
		System.out.println(w);
		return w;
	 }
	 
	 static double displayTwoProductweights(double j,double h){
		System.out.println(j);
		System.out.println(h);
		return h;
	 }
	 
	 static int displayThreeProductQuantities(int r,int t,int i){
		System.out.println(r);
		System.out.println(t);
		System.out.println(i);
		return i;
	 }
}
