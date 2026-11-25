class Snapdeal{
	public static void main(String[] args){
		
        String[] productNames={"Mixer","Speaker","Watch","Shoes","Backpack"};
		
		System.out.println("for loop");
		for(int i=0;i<=productNames.length-1;i++){
			System.out.println(productNames[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String productName:productNames){
		System.out.println(productName);
		}
		
		System.out.println();
        boolean[] availability={true,false,true,true,false};
		
		System.out.println("for loop");
		for(int i=0;i<=availability.length-1;i++){
			System.out.println(availability[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(boolean b:availability){
		System.out.println(b);
		}
		
		System.out.println();
        float[] ratings={4.5f,4.2f,4.8f,3.9f,4.6f};
		
		System.out.println("for loop");
		for(int i=0;i<=ratings.length-1;i++){
			System.out.println(ratings[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(float rating:ratings){
		System.out.println(rating);
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