class Ajio{
	public static void main(String[] args){
		
        boolean[] availability={true,false,true,true,false};
		
		System.out.println("for loop");
		for(int i=0;i<=availability.length-1;i++){
			System.out.println(availability[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(boolean a:availability){
		System.out.println(a);
		}
		
		System.out.println();
        float[] ratings={4.5f,4.2f,4.8f,3.9f,4.6f};	
		
		System.out.println("for loop");
		for(int i=0;i<=ratings.length-1;i++){
			System.out.println(ratings[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(float b:ratings){
		System.out.println(b);
		}
		
		System.out.println();
        String[] productNames={"Shirts","Jeans","Dresses","Shoes","Jackets"};
		
		System.out.println("for loop");
		for(int i=0;i<=productNames.length-1;i++){
			System.out.println(productNames[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String c:productNames){
		System.out.println(c);
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
	}
}