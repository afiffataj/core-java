class Product{
	public static int cost(String productName){
		System.out.println("running productName in product");
		System.out.println("productName="+productName);
		return 45000;
	}
	public static double weight(String productName,String brand){
		System.out.println("productName="+productName);
		System.out.println("brand="+brand);
		return 30.5;
	}
	public static int warranty(String productName,String brand){
		System.out.println("productName="+productName);
		System.out.println("brand="+brand);
		return 3;
	}
}