class HeyBaby{
	public static void main(String[] args){
		
        String[] productNames={"Teddy","Doll","Rattle","Blocks","Puzzle"};
		
		System.out.println("for loop");
		for(int i=0;i<=productNames.length-1;i++){
			System.out.println(productNames[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String pn:productNames){
		System.out.println(pn);
		}
		
		System.out.println();
        double[] prices={299,499,199,399,599};
		
		System.out.println("for loop");
		for(int i=0;i<=prices.length-1;i++){
			System.out.println(prices[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double p:prices){
		System.out.println(p);
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