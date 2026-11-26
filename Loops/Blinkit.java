class Blinkit{
	public static void main(String[] argsfgs){
		
		System.out.println("The Products Of Blinkit");
	     
		String product1 = "Milk";
        String product2 = "Bread";
        String product3 = "Eggs";
        String product4 = "Butter";
        String product5 = "Cheese";
        String product6 = "Rice";
        String product7 = "Wheat Flour";
        String product8 = "Sugar";
        String product9 = "Salt";
        String product10 = "Cooking Oil";
        String product11 = "Apples";
        String product12 = "Bananas";
        String product13 = "Oranges";
        String product14 = "Potatoes";
        String product15 = "Tomatoes";
        String product16 = "Onions";
        String product17 = "Biscuits";
        String product18 = "Chocolates";
        String product19 = "Shampoo";
        String product20 = "Toothpaste";
		
		String[] products={product1,product3,product5,product7,product9,
		product11,product13,product15,product17,product19};
		Blinkit.addToCart(products);
	}
	
	static void addToCart(String[] a){
		
		for(String p:a){
			System.out.println(p);
		}
		
		System.out.println();
		for(int i=0;i<=9;i++){
			System.out.println(a[i]);
		}
	}
}
           