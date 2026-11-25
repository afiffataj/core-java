class Flipkart{
	public static void main(String[] args){
		
		double[] productPrices={12999.0,45999.0,1499.0,2999.0,799.0,5999.0,899.0,1999.0};
		
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
	    String[] customerNames={"Afifa","Ayesha","Rahul","Priya","Arjun","Sneha","Kavya","Rohan"};
		 
		System.out.println("for loop");
		for(int i=0;i<=customerNames.length-1;i++){
			System.out.println(customerNames[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String customerName:customerNames){
		System.out.println(customerName);
		}
		
		System.out.println();
		int[] stockQuantities={45,67,89,23,56,78,34,90};
		
		System.out.println("for loop");
		for(int i=0;i<=stockQuantities.length-1;i++){
			System.out.println(stockQuantities[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(int s:stockQuantities){
		System.out.println(s);
		}
		
		System.out.println();
         boolean[] deliveryStatus={true,false,true,true,false,true,false,true};  		
		System.out.println("for loop");
		for(int i=0;i<=deliveryStatus.length-1;i++){
			System.out.println(deliveryStatus[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(boolean delivery:deliveryStatus){
			System.out.println(delivery);
		}
	}
}