class FirstCry{
	public static void main(String[] args){
		
        String[] babyProducts={"Diapers","Toys","Bottles","Clothes","Strollers"};
		
		System.out.println("for loop");
		for(int i=0;i<=babyProducts.length-1;i++){
			System.out.println(babyProducts[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String a:babyProducts){
		System.out.println(a);
		}
		
		System.out.println();
        double[] prices={499,799,299,999,2499};
		
		System.out.println("for loop");
		for(int i=0;i<=prices.length-1;i++){
			System.out.println(prices[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double b:prices){
		System.out.println(b);
		}
		
		System.out.println();
        short[] stockQuantities={120,250,340,150,400};
		
		System.out.println("for loop");
		for(int i=0;i<=stockQuantities.length-1;i++){
			System.out.println(stockQuantities[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(short c:stockQuantities){
		System.out.println(c);
		}
		
		System.out.println();
        boolean[] availability={true,false,true,true,false};
		 
		System.out.println("for loop");
		for(int i=0;i<=availability.length-1;i++){
			System.out.println(availability[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(boolean c:availability){
			System.out.println(c);
		}
	}
}