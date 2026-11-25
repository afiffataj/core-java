class Amazon{
	public static void main(String[] args){
		
		String[] availableProducts={"Mobile", "Laptop", "Headphones", "Smartwatch", 
		"Kurtis", "Jeans", "Shoes", "Makeup", "Skincare", "Handbags", "Backpacks", 
		"Books", "Furniture", "Kitchen Items", "Jewellery", "Toys", "Sports Items", "Watches"};
		
		System.out.println("for loop");
		for(int i=0;i<=availableProducts.length-1;i++){
			System.out.println(availableProducts[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(String availableProduct:availableProducts){
		System.out.println(availableProduct);
		}
		
		System.out.println();
	    long[] productNumbers={9087654,98765456,234567,345678,999444,4356785,567876,676543,234567,
		654326,654567,234568,1234567};
		 
		System.out.println("for loop");
		for(int i=0;i<=productNumbers.length-1;i++){
			System.out.println(productNumbers[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(long productNumber:productNumbers){
		System.out.println(productNumber);
		}
		
		System.out.println();
		char[] sizes={'g','f','r','o','t','a'};
		
		System.out.println("for loop");
		for(int i=0;i<=sizes.length-1;i++){
			System.out.println(sizes[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(char size:sizes){
		System.out.println(size);
		}
		
		System.out.println();
		double[] ratings={4.5d,9.0d,5.8d,4.4d,6.6d,7.1d,8.8d,0.2d};
		
		System.out.println("for loop");
		for(int i=0;i<=ratings.length-1;i++){
			System.out.println(ratings[i]);
		}
		
		System.out.println();
		System.out.println("for-each");
		for(double rating:ratings){
			System.out.println(rating);
		}
	}
}