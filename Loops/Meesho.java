class Meesho{
	public static void main(String[] args){
		
		String[] availableCategories={"Sarees","Kurtis","Western Wear","Ethnic Wear","Jewellery",
		"Footwear","Beauty","Home Decor"};
		
		System.out.println("for loop");
		for(int i=0;i<=availableCategories.length-1;i++){
			System.out.println(availableCategories[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String availableCategorie:availableCategories){
		System.out.println(availableCategorie);
		}
		
		System.out.println();
	    long[] sellerIds={987654321,876543219,765432198,654321987,543219876,432198765};
		 
		System.out.println("for loop");
		for(int i=0;i<=sellerIds.length-1;i++){
			System.out.println(sellerIds[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(long sellerId:sellerIds){
		System.out.println(sellerId);
		}
		
		System.out.println();
        double[] productPrices={499.0,799.0,299.0,599.0,199.0,999.0,349.0,1299.0};		
		System.out.println("for loop");
		for(int i=0;i<=productPrices.length-1;i++){
			System.out.println(productPrices[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double productPrice:productPrices){
		System.out.println(productPrice);
		}
		
		System.out.println();
        char[] availableSizes={'S','M','L','X','A','F','N','P'};		
		System.out.println("for loop");
		for(int i=0;i<=availableSizes.length-1;i++){
			System.out.println(availableSizes[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(char availableSize:availableSizes){
			System.out.println(availableSize);
		}
	}
}