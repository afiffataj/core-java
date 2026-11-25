class Myntra{
	public static void main(String[] arjhgfghxv){
		
		String[] clothingBrands={"H&M","Zara","Nike","Puma","Adidas","Levis","Roadster","DressBerry"};
		
		System.out.println("for loop");		
		for(int i=0;i<=clothingBrands.length-1;i++){
			System.out.println(clothingBrands[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String clothingBrand:clothingBrands){
			System.out.println(clothingBrand);
		}
		
		System.out.println();
		long[] orderNumbers={987654321,876543210,765432109,654321098,543210987,432109876};
		
		System.out.println("for loop");		
		for(int i=0;i<=orderNumbers.length-1;i++){
			System.out.println(orderNumbers[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(long orderNumber:orderNumbers){
			System.out.println(orderNumber);
		}
		
		System.out.println();
        boolean[] membershipStatus={true,false,true,true,false,false,true,true};
		
		System.out.println("for loop");		
		for(int i=0;i<=membershipStatus.length-1;i++){
			System.out.println(membershipStatus[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(boolean p:membershipStatus){
			System.out.println(p);
		}
		
		System.out.println();
        double[] productPrices={1499.50,2499.99,899.00,1799.50,3299.00,599.99,1199.00,999.50};		
		System.out.println("for loop");		
		for(int i=0;i<=productPrices.length-1;i++){
			System.out.println(productPrices[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double pp:productPrices){
			System.out.println(pp);
		}
		
	}
}