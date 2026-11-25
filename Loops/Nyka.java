class Nyka{
	public static void main(String[] args){
		
        String[] beautyProducts={"Lipstick","Foundation","Mascara","Eyeliner","Compact Powder",
		"Face Serum","Moisturizer","Sunscreen"};
		
		System.out.println("for loop");		
		for(int i=0;i<=beautyProducts.length-1;i++){
			System.out.println(beautyProducts[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String b:beautyProducts){
			System.out.println(b);
		}
		
		System.out.println();
        float[] productRatings={4.5f,4.2f,4.8f,3.9f,4.6f,4.3f,4.7f,4.1f};	
		
		System.out.println("for loop");		
		for(int i=0;i<=productRatings.length-1;i++){
			System.out.println(productRatings[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(float pr:productRatings){
			System.out.println(pr);
		}
		
		System.out.println();
        double[] productPrices={499.0,899.0,299.0,199.0,549.0,799.0,650.0,399.0};
		
		System.out.println("for loop");		
		for(int i=0;i<=productPrices.length-1;i++){
			System.out.println(productPrices[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double pp:productPrices){
			System.out.println(pp);
		}
		
		System.out.println();
        short[] stockQuantities={120,250,340,150,400,275,180,300};	
		
		System.out.println("for loop");		
		for(int i=0;i<=stockQuantities.length-1;i++){
			System.out.println(stockQuantities[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(short sq:stockQuantities){
			System.out.println(sq);
		}
		
	}
}