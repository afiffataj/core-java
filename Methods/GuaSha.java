class GuaSha{
	public static void main(String[] args){
		
		System.out.println("Is Gua Sha available");
		GuaSha.isGuaShaAvailable();
		
		System.out.println("Is Gua Sha under buget");
		GuaSha.isGuaShaUnderBuget();
		
		System.out.println("The size of Gua Sha");
		char size=GuaSha.theSizeOfGuaSha();
		System.out.println(size);
		
		System.out.println("Is Gua Sha helpfull");
		boolean helpfull=GuaSha.isGuaShaHelpful();
		System.out.println(helpfull);
		
		System.out.println("The color of Gua Sha");
		String color="Rosemarey";
		GuaSha.theColorOfGuaSha(color);
		
		System.out.println("The discount of Gua Sha");
		int discount=34;
		int discount1=56;
		GuaSha.theDiscountOfGuaSha(discount,discount1);
		
		System.out.println("The shape of Gua Sha");
		String shape="Round";
		String shape1="Cylindrical";
		String shape2="Square";
		GuaSha.theShapeOfGuaSha(shape,shape1,shape2);
		
		System.out.println("The Length Of Gua Sha");
		float length=1.5f;
		GuaSha.theLengthOfGuaSha(length);
		
		System.out.println("The Weight of Gua Sha");
		double weight=25.8d;
		double weight1=20.8d;
		GuaSha.theWeightOfGuaSha(weight,weight1);
		
		System.out.println("The Price Of Gua Sha");
		int price=1200;
		int price1=450;
		int price2=4433;
		GuaSha.thePriceOfGuaSha(price,price1,price2);
	}
	static void isGuaShaAvailable(){
		System.out.println("Yes GuaSha is available");
	}
	
	static void isGuaShaUnderBuget(){
		System.out.println("Yes Gua Sha is under buget");
	}
	
	static char theSizeOfGuaSha(){
		char size='l';
		return size;
	}
	
	static boolean isGuaShaHelpful(){
		boolean allSize=true;
		return allSize;
	}
	
	static void theColorOfGuaSha(String a){
		System.out.println(a);
	}
	
	static void theDiscountOfGuaSha(int b,int c){
		System.out.println(b);
		System.out.println(c);
	}
	
	static void theShapeOfGuaSha(String s,String r,String h){
		System.out.println(s);
		System.out.println(r);
		System.out.println(h);
	}
	
	static float theLengthOfGuaSha(float t){
		System.out.println(t);
		return t;
	}
	
	static double theWeightOfGuaSha(double i,double j){
		System.out.println(i);
		System.out.println(j);
		return j;
	}
	
	static int thePriceOfGuaSha(int h,int y,int z){
		System.out.println(h);
		System.out.println(y);
		System.out.println(z);
		return y;
	}
}